package com.example.mdbspringboot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Participant {

	@Id
	private String id_usuario;
	private String nombre;
	private Date f_ingreso;
	private Date f_salida;
	private String rol;
	private int h_trabajo;
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getF_ingreso() {
		return f_ingreso;
	}
	public void setF_ingreso(Date f_ingreso) {
		this.f_ingreso = f_ingreso;
	}
	public Date getF_salida() {
		return f_salida;
	}
	public void setF_salida(Date f_salida) {
		this.f_salida = f_salida;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getH_trabajo() {
		return h_trabajo;
	}
	public void setH_trabajo(int h_trabajo) {
		this.h_trabajo = h_trabajo;
	}
	
}
