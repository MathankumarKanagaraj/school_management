package com.school.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Choice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
	private Long id;

	private String text;
	private Boolean isCorrect;
	private long point;
	@ManyToOne
	private Question question;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
		if (isCorrect != null && isCorrect) {
			this.point = 10;
		} else {
			this.point = 0;
		}
	}

	public long getPoint() {
		return point;
	}

	public void setPoint(long point) {
		this.point = point;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
