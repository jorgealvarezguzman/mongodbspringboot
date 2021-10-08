package com.example.mdbspringboot.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Usuarios")
public class User {
	
	@Id
	private String id;
	
	private String nombre;
	private String email;
	private String password;
	private String celular;
	private String carrera;
	private String rol;
	private List<String> proyectos;
	private String creacion;
	
	public User() {}
	
	public User(String nombre, String email, String password, String celular, String rol, List<String> proyectos,
			String creacion) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.celular = celular;
		this.rol = rol;
		this.proyectos = proyectos;
		this.creacion = creacion;
	}
	
	public User(String nombre, String email, String password, String celular, String carrera, String rol,
			List<String> proyectos, String creacion) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.celular = celular;
		this.carrera = carrera;
		this.rol = rol;
		this.proyectos = proyectos;
		this.creacion = creacion;
	}
	
	public User(String nombre, String email, String password, String celular, String carrera, String rol,
			List<String> proyectos) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.celular = celular;
		this.carrera = carrera;
		this.rol = rol;
		this.proyectos = proyectos;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public List<String> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<String> proyectos) {
		this.proyectos = proyectos;
	}
	public String getCreacion() {
		return creacion;
	}
	public void setCreacion(String creacion) {
		this.creacion = creacion;
	}



	public String getCarrera() {
		return carrera;
	}



	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
