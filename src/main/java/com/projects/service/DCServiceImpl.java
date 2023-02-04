package com.projects.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.projects.entities.PlansDetails;
import  com.projects.repo.DCRepository;
@Service
public class DCServiceImpl implements DCService{
	@Autowired
	private  DCRepository repo;

	@Override
	public String savePlan(PlansDetails plan) {
		plan =repo.save(plan);
		if(plan.getCaseId()!=null)
			return "plan Saved succefully";
		else{
			return "plan Save Failed ";
		}
	}

	@Override	
	public List<PlansDetails> getAllPlans() {


		List<PlansDetails> plans=repo.findAll();

		return plans;
	}
	
	@Override	
	public List<PlansDetails> SaveKidsDetails() {


		List<PlansDetails> plans=repo.findAll();

		return plans;
	}
	@Override	
	public List<PlansDetails> SaveIncomedetails() {


		List<PlansDetails> plans=repo.findAll();

		return plans;
	}






}
