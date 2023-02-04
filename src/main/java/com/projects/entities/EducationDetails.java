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

}
