package com.piks.activemqjmsdemo.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.piks.activemqjmsdemo.models.User;

public interface UserService {
	public Page<User> findAll(Pageable page);

	public User save(User obj);

	public Optional<User> findById(Long id);

	public Page<User> restCall();
}
	