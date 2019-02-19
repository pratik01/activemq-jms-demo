package com.piks.activemqjmsdemo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.piks.activemqjmsdemo.models.User;
import com.piks.activemqjmsdemo.repository.UserRepository;
import com.piks.activemqjmsdemo.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public Page<User> findAll(Pageable page) {
		return userRepo.findAll(page);
	}

	@Override
	public User save(User obj) {
		return userRepo.save(obj);
	}

	@Override
	public Optional<User> findById(Long id) {
		return userRepo.findById(id);
	}

	@Override
	public Page<User> restCall() {
		RestTemplate rest = new RestTemplate();
		ResponseEntity<RestPageImpl<User>> response = rest.exchange("http://localhost:8080/api/users", HttpMethod.GET, null,
				new ParameterizedTypeReference<RestPageImpl<User>>() {
				});
		Page<User> user = response.getBody();
		return user;
	}

}
