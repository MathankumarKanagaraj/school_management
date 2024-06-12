package com.school.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.student.entity.Question;
import com.school.student.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	public Question createQuestions(Question questions) {
		return this.questionRepository.save(questions);
	}

	public List<Question> retriveQuestions() {
		return this.questionRepository.findAll();
	}

}
