package com.projects.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.entities.PlansDetails;

public interface DCRepository extends JpaRepository<PlansDetails, Integer>{

	
	
}
