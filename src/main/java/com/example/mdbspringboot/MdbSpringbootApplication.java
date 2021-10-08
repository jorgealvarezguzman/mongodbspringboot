package com.example.mdbspringboot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mdbspringboot.model.User;
import com.example.mdbspringboot.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringbootApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepo;
	
	List<User> userList = new ArrayList<User>();

	public static void main(String[] args) {
		SpringApplication.run(MdbSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//System.out.println("-------------CREATE USER-------------------------------\n");
		
		//createUser();
		
		System.out.println("\n----------------SHOW ALL USERS---------------------------\n");
		
		showAllUsers();
		
		System.out.println("\n--------------GET USER BY NAME-----------------------------------\n");
		
		getUserByName("Test2");
		
		System.out.println("\n-------------------THANK YOU---------------------------");
		
	}

	// CRUD operations
	
	// CREATE
	public void createUser() {
		System.out.println("Data creation started...");
		userRepo.save(new User("Test2", "t2@t.com", "12345", "11111", "Test2", Collections.<String>emptyList(), "7/10/2021"));
		System.out.println("Data creation complete...");
	}
	
	
	// READ
	// 1. Show all the data
	 public void showAllUsers() {
		 
		 userList = userRepo.findAll();
		 
		 userList.forEach(user -> System.out.println(getUserDetails(user)));
	 }
	
	// 2. Get item by name
	 public void getUserByName(String name) {
		 System.out.println("Getting user by name: " + name);
		 User user = userRepo.findUserByName(name);
		 System.out.println(getUserDetails(user));
	 }
	
	// Print details in readable form
	 
	 public String getUserDetails(User user) {

		 System.out.println(
		 "Nombre: " + user.getNombre() + 
		 ", \nEmail: " + user.getEmail() +
		 ", \nPassword: " + user.getPassword() +
		 ", \nCelular: " + user.getCelular() +
		 ", \nRol: " + user.getRol() +
		 ", \nProyectos: " + user.getProyectos() +
		 ", \nCreacion: " + user.getCreacion()
		 );
		 
		 return "";
	 }
}
