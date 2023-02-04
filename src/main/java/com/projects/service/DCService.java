package com.projects.service;

import java.util.List;

import com.projects.entities.PlansDetails;

public interface DCService {
	
	public  String savePlan(PlansDetails plan);
	public List<PlansDetails> getAllPlans();
	List<PlansDetails> SaveKidsDetails();
	List<PlansDetails> SaveIncomedetails();

}
