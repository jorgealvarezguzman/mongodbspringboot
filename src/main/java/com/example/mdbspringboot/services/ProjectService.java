package com.example.mdbspringboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mdbspringboot.model.Participant;
import com.example.mdbspringboot.model.Project;
import com.example.mdbspringboot.repository.ProjectRepository;

@Service
public class ProjectService {

	ProjectRepository projectRepo;
	
	List<Object> projectList = new ArrayList<Object>();
	
	@Autowired
	public ProjectService(ProjectRepository projectRepo) {
		this.projectRepo = projectRepo;
	}

	public List<Project> findAll() { 
		return projectRepo.findAll();
	}
	
	public List<Object> getParticipants() { 
		projectList.clear();
		projectList = projectRepo.findParticipants();
		return projectList;
	}
	
	public Project createProject(Project project) {
		Project newProject = projectRepo.save(project);
		return newProject;
	}
	
	public Project editParticipant(String idProyecto, String idParticipante, Participant participant) {
		Project project = projectRepo.findProjectParticipant(idProyecto, idParticipante);
		List<Participant> participants = project.getUsuarios();
		
		for(Participant participante : participants)
		{
			if(participante.getId_usuario() == idParticipante)
			{
				participante = participant;
			}
		}
		project.setUsuarios(participants);
		projectRepo.save(project);
		return project;
	}
}
