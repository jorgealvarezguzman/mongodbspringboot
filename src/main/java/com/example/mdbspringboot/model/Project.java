package com.example.mdbspringboot.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Proyectos")
public class Project {
	
	@Id
	private String id;
	
	private String descripcion;
	private String obj_gen;
	private String obj_esp;
	private Integer presupuesto;
	private Date f_inicial;
	private Date f_final;
	private String estado;
	private List<Participant> usuarios;
	private List<Object> observaciones;
	
	public Project() {}
	
	public Project(String descripcion, String obj_gen, String obj_esp, Integer presupuesto, Date f_final, List<Participant> usuarios,
			String estado) {
		super();
		this.descripcion = descripcion;
		this.obj_gen = obj_gen;
		this.obj_esp = obj_esp;
		this.presupuesto = presupuesto;
		this.f_final = f_final;
		this.usuarios = usuarios;
		this.estado = estado;
	}
	
	public Project(String descripcion, String obj_gen, String obj_esp, Integer presupuesto, Date f_inicial, Date f_final,
			List<Participant> usuarios, String estado, List<Object> observaciones) {
		super();
		this.descripcion = descripcion;
		this.obj_gen = obj_gen;
		this.obj_esp = obj_esp;
		this.presupuesto = presupuesto;
		this.f_inicial = f_inicial;
		this.f_final = f_final;
		this.usuarios = usuarios;
		this.estado = estado;
		this.observaciones = observaciones;
	}
	
	public Project(String descripcion, String obj_gen, String obj_esp, Integer presupuesto, Date f_inicial, Date f_final,
			List<Participant> usuarios) {
		super();
		this.descripcion = descripcion;
		this.obj_gen = obj_gen;
		this.obj_esp = obj_esp;
		this.presupuesto = presupuesto;
		this.f_inicial = f_inicial;
		this.f_final = f_final;
		this.usuarios = usuarios;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescipcion() {
		return descripcion;
	}
	public void setDescipcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getObjetivoGeneral() {
		return obj_gen;
	}
	public void setObjetivoGeneral(String obj_gen) {
		this.obj_gen = obj_gen;
	}
	public String getObjetivoEspecifico() {
		return obj_esp;
	}
	public void setObjetivoEspecifico(String obj_esp) {
		this.obj_esp = obj_esp;
	}
	public Integer getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Date getFechaFinal() {
		return f_final;
	}
	public void setFechaFinal(Date f_final) {
		this.f_final = f_final;
	}
	public List<Participant> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Participant> usuarios) {
		this.usuarios = usuarios;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaInicial() {
		return f_inicial;
	}

	public void setFechaInicial(Date f_inicial) {
		this.f_inicial = f_inicial;
	}	

	public List<Object> getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(List<Object> observaciones) {
		this.observaciones = observaciones;
	}	
}

