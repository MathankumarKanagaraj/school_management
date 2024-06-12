package com.school.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.student.entity.Test;
import com.school.student.repository.Testrepository;

@Service
public class Testservice {

	@Autowired
	Testrepository testRepository;

	public Test createTest(Test test) {
		return this.testRepository.save(test);
	}

	public List<Test> retriveTest(Test test) {
		return testRepository.findAll();
	}
}
