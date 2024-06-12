	package com.school.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
	private Long id;

	private String testName;

	private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

//	@ManyToOne
//	private Student student;
//	
//	@ManyToOne
//	private Question question;
//
//	@ManyToOne
//	private Choice choice;

}
