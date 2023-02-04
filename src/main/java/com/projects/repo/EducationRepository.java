package com.projects.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.entities.EducationDetails;
import com.projects.entities.PlansDetails;

public interface EducationRepository extends JpaRepository<EducationDetails, Integer>{

	
	
}
