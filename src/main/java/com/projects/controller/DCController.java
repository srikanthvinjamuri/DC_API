package com.projects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import  com.projects.entities.PlansDetails;
import com.projects.service.DCService;

@RestController
public class DCController {

	@Autowired
	DCService dcsrve;
	
@GetMapping("/plans")
	private List<PlansDetails> getPlans()
	{	
	return dcsrve.getAllPlans();
	}

@PostMapping("/plans")
private String createCasePlan( @RequestBody PlansDetails plan)
{	
return dcsrve.savePlan(plan);
}



}
