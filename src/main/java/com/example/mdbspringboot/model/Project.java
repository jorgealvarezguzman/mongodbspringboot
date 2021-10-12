package com.example.mdbspringboot.model;

import java.util.List;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Proyectos")
public class Project {
	
	@Id
	private String id;
	
	private String descripcion;
	private String obj_gen;
	private List<String> obj_esp;
	private Double presupuesto;
	private Date f_inicial;
	private Date f_final;
	private String estado;
	private List<Object> usuarios;
	private List<String> observaciones;
	
	public Project() {}

	public Project(String descripcion, String obj_gen, List<String> obj_esp, Double presupuesto,
			Date f_inicial, Date f_final, String estado, List<Object> usuarios, List<String> observaciones) {
		super();
		this.descripcion = descripcion;
		this.obj_gen = obj_gen;
		this.obj_esp = obj_esp;
		this.presupuesto = presupuesto;
		this.f_inicial = f_inicial;
		this.f_final = f_final;
		this.estado = estado;
		this.usuarios = usuarios;
		this.observaciones = observaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObj_gen() {
		return obj_gen;
	}

	public void setObj_gen(String obj_gen) {
		this.obj_gen = obj_gen;
	}

	public List<String> getObj_esp() {
		return obj_esp;
	}

	public void setObj_esp(List<String> obj_esp) {
		this.obj_esp = obj_esp;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Date getF_inicial() {
		return f_inicial;
	}

	public void setF_inicial(Date f_inicial) {
		this.f_inicial = f_inicial;
	}

	public Date getF_final() {
		return f_final;
	}

	public void setF_final(Date f_final) {
		this.f_final = f_final;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Object> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Object> usuarios) {
		this.usuarios = usuarios;
	}

	public List<String> getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(List<String> observaciones) {
		this.observaciones = observaciones;
	}
	
}