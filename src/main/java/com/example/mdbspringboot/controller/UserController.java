package com.example.mdbspringboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mdbspringboot.model.User;
import com.example.mdbspringboot.services.UserService;

@Controller
@EnableMongoRepositories
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/usuarios")
	@ResponseBody
	public List<User> getUsers(@RequestParam(name="id", required=false) String id) {
		if (id == null) {
			return userService.getUsers();
		}
		return userService.getUserById(id);
	}
	
	@PostMapping("/usuarios")
	@ResponseBody
	public List<User> createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
}