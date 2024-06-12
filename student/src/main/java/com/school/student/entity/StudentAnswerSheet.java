package com.school.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentAnswerSheet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private Question question;

	@ManyToOne
	private Choice choice;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Test test;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Choice getChoice() {
		return choice;
	}

	public void setChoice(Choice choice) {
		this.choice = choice;
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
}
