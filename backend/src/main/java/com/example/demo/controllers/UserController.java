package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.UserService;


@RestController
public class UserController {
	
	@Autowired
    private UserService userService;

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.findAll();
	}
}
