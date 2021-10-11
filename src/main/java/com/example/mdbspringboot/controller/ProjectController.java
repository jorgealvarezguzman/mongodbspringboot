package com.example.mdbspringboot.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mdbspringboot.model.Participant;
import com.example.mdbspringboot.model.Project;
import com.example.mdbspringboot.services.ProjectService;

@Controller
@EnableMongoRepositories
public class ProjectController {

	private ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping("/participantes")
	@ResponseBody
	public List<Object> getParticipants() {
		return projectService.getParticipants();
	}
	
	@PostMapping("/proyectos")
	@ResponseBody
	public Project createProject(@RequestBody Project project) {
		return projectService.createProject(project);
	}
	
	@PatchMapping("/proyectos/{idProyecto}/participantes/{idParticipante}")
	public Project updateParticipant(@PathVariable String idProyecto,
			@PathVariable String idParticipante, 
			@RequestBody Participant participant) {
		
		return projectService.editParticipant(idProyecto, idParticipante, participant);
	}
	
}