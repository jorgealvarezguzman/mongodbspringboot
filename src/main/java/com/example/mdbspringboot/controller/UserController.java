package com.example.mdbspringboot.controller;


import java.util.ArrayList;
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
import com.example.mdbspringboot.repository.UserRepository;

@Controller
@EnableMongoRepositories
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	List<User> userList = new ArrayList<User>();

	@GetMapping("/usuarios")
	@ResponseBody
	public List<User> getUsers(@RequestParam(name="id", required=false) String id) {
		if (id != null) {
			userList.clear();
			userList.add(userRepo.findUserById(id));
			return userList;
		}
		return userRepo.findAll();
	}
	
	@PostMapping("/usuarios")
	@ResponseBody
	public List<User> createUser(@RequestBody User user) {
		userRepo.save(user);
		return userRepo.findAll();
	}
	
}