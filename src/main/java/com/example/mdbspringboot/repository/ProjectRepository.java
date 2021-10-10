package com.example.mdbspringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.mdbspringboot.model.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {
	
	@Query(value="{}", fields="{ 'usuarios' : 1 }")
	List<Object> findParticipants();
	
	// @Query("{id:'?0'}")
	// Project findProjectById(String id);
	
	List<Project> findAll();
	
	public long count();

}
