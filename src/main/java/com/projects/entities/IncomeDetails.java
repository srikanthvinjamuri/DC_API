package com.projects.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="INCOME_DTLS")
public class IncomeDetails {
	@Id
	@GeneratedValue
private Integer Id;
private Double  MontlySal;
private Double  RentIncome;
private Double  PropertyIncome;

		

}
