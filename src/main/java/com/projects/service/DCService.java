package com.projects.service;

import java.util.List;

import com.projects.entities.EducationDetails;
import com.projects.entities.IncomeDetails;
import com.projects.entities.PlansDetails;

public interface DCService {
	
	public  String savePlan(PlansDetails plan);
	public List<PlansDetails> getAllPlans();
	public String SaveEduDetails(EducationDetails edd);
	public String SaveIncomedetails(IncomeDetails icdd);
	

}
