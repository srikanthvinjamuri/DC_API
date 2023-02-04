package com.projects.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PLAN_DTLS")
public class PlansDetails {
	@Id
	@GeneratedValue
private Integer caseId;
private String  planName;
public Integer getCaseId() {
	return caseId;
}
public void setCaseId(Integer caseId) {
	this.caseId = caseId;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}



		

}
