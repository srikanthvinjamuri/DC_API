package com.projects.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.entities.IncomeDetails;


public interface IncomeRepository extends JpaRepository<IncomeDetails, Integer>{

	
	
}
