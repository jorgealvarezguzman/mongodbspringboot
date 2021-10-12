package com.example.mdbspringboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mdbspringboot.model.Project;
import com.example.mdbspringboot.model.User;
import com.example.mdbspringboot.repository.ProjectRepository;

@Service
public class ProjectService {

	ProjectRepository projectRepo;
	
	List<Project> projectList = new ArrayList<Project>();
	
	@Autowired
	public ProjectService(ProjectRepository projectRepo) {
		this.projectRepo = projectRepo;
	}

	public List<Project> getProjects() { 
		return projectRepo.findAll();
	}
	
	public List<Project> getProjectById(String id) { 
		projectList.clear();
		projectList.add(projectRepo.findProjectById(id));
		return projectList;
	}
	
	public List<Project> createProject(Project project) {
		projectRepo.save(project);
		return projectRepo.findAll();
	}

	public Project addParticipantToProject(String idProyecto, User user) {
		// TODO Auto-generated method stub
		Project encontrado = projectRepo.findProjectById(idProyecto);
		encontrado.getUsuarios().add(user);
		projectRepo.save(encontrado);
		return encontrado;
	}
	
}
