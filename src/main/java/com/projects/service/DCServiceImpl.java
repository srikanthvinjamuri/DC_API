package com.projects.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.entities.EducationDetails;
import com.projects.entities.IncomeDetails;
import  com.projects.entities.PlansDetails;
import com.projects.repo.EducationRepository;
import com.projects.repo.IncomeRepository;
import  com.projects.repo.PlanRepository;
@Service
public class DCServiceImpl implements DCService{
	@Autowired
	private  PlanRepository Planrepo;
	@Autowired
	private  IncomeRepository  Icmdrepo;
	@Autowired
	private  EducationRepository Edurepo;

	@Override
	public String savePlan(PlansDetails plan) {
		plan =Planrepo.save(plan);
		if(plan.getCaseId()!=null)
			return "plan Saved succefully";
		else{
			return "plan Save Failed ";
		}
	}

	@Override	
	public List<PlansDetails> getAllPlans() {
		List<PlansDetails> plans=Planrepo.findAll();
		return plans;
	}
	
	@Override	
	public String SaveEduDetails(EducationDetails ed) {

		ed =Edurepo.save(ed);
		if(ed.getId()!=null)
			return "Educationdetails Saved succefully";
		else{
			return "Educationdetails";
		}
	}
	@Override	
	public String SaveIncomedetails(IncomeDetails icd) {

		icd =Icmdrepo.save(icd);
		if(icd.getId()!=null)
			return "IncomeDetails Saved succefully";
		else{
			return "IncomeDetails Save Failed ";
		}
	}



}
