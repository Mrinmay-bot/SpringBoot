package com.spring.springboot.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUD_ID", unique = true, nullable = false)
	private int studId;
	private String studName;
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}

}
