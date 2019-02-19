package com.piks.activemqjmsdemo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piks.activemqjmsdemo.models.User;
import com.piks.activemqjmsdemo.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public Page<User> findAll(Pageable page) {
		return userService.findAll(page);
	}

	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}

	@PostMapping
	public User save(@RequestBody User obj) {
		System.out.println(obj.toString());
		return userService.save(obj);
	}
	
	@GetMapping("/restcall")
	public Page<User> restCall() {
		return userService.restCall();
	}
}
