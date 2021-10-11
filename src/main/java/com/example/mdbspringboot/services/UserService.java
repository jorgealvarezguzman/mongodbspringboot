package com.example.mdbspringboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mdbspringboot.model.User;
import com.example.mdbspringboot.repository.UserRepository;

@Service
public class UserService {

	UserRepository userRepo;
	
	List<User> userList = new ArrayList<User>();
	
	@Autowired
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public List<User> getUsers() { 
		return userRepo.findAll();
	}
	
	public List<User> getUserById(String id) { 
		userList.clear();
		userList.add(userRepo.findUserById(id));
		return userList;
	}
	
	public List<User> createUser(User user) {
		userRepo.save(user);
		return userRepo.findAll();
	}
	
	public User updateUser(String usuarioId, User usuario) {
        User usuarioEncontrado = userRepo.findById(usuarioId)
                .orElseThrow(() -> new IllegalStateException(
                        "Usuario con id " + usuarioId + " no existe"
                ));
        userRepo.save(usuario);
        return usuario;
    }
}
