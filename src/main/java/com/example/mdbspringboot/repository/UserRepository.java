package com.example.mdbspringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.mdbspringboot.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	@Query("{nombre:'?0'}")
	User findUserByName(String nombre);
	
	@Query("{id:'?0'}")
	User findUserById(String id);
	
	List<User> findAll();
	
	public long count();

}
