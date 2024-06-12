package com.school.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.student.entity.Choice;
import com.school.student.repository.ChoiceRepository;

@Service
public class ChoiceService {

	@Autowired
	private ChoiceRepository choicerepository;

	public Choice createChoice(final Choice choice) {
		return this.choicerepository.save(choice);
	}

	public List<Choice> retriveChoice() {
		return this.choicerepository.findAll();
	}

}
