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


public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public Double getMontlySal() {
	return MontlySal;
}
public void setMontlySal(Double montlySal) {
	MontlySal = montlySal;
}
public Double getRentIncome() {
	return RentIncome;
}
public void setRentIncome(Double rentIncome) {
	RentIncome = rentIncome;
}
public Double getPropertyIncome() {
	return PropertyIncome;
}
public void setPropertyIncome(Double propertyIncome) {
	PropertyIncome = propertyIncome;
}

		

}
