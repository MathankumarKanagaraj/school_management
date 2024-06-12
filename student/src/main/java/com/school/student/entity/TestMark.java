package com.school.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TestMark {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
	private Long id;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Test test;

	private long points;

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public long getPoints() {
		return points;
	}

	public void setPoints(long points) {
		this.points = points;
	}
}
