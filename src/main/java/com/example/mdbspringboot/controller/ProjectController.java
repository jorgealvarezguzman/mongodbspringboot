package com.example.mdbspringboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mdbspringboot.model.Project;
import com.example.mdbspringboot.model.User;
import com.example.mdbspringboot.services.ProjectService;

@Controller
@EnableMongoRepositories
public class ProjectController {

	private ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping("/proyectos")
	@ResponseBody
	public List<Project> getProjects(@RequestParam(name="id", required=false) String id) {
		if (id == null) {
			return projectService.getProjects();
		}
		return projectService.getProjectById(id);
	}
	
	@PostMapping("/proyectos")
	@ResponseBody
	public List<Project> createProject(@RequestBody Project project) {
		return projectService.createProject(project);
	}
	
	@PostMapping("/proyectos/{idProyecto}/participantes")
	public Project addParticipantToProject(@PathVariable("idProyecto") String idProyecto, 
    									   @RequestBody User user) {
		return projectService.addParticipantToProject(idProyecto, user);
	}
	
	
}