package com.projects.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EDU_DTLS")
public class EducationDetails {
	@Id
	@GeneratedValue
private Integer Id;
private Integer GraduationYr;
private String  HighestDegree;
private String  University;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public Integer getGraduationYr() {
	return GraduationYr;
}
public void setGraduationYr(Integer graduationYr) {
	GraduationYr = graduationYr;
}
public String getHighestDegree() {
	return HighestDegree;
}
public void setHighestDegree(String highestDegree) {
	HighestDegree = highestDegree;
}
public String getUniversity() {
	return University;
}
public void setUniversity(String university) {
	University = university;
}

}
