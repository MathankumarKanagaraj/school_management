package com.school.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.student.entity.TestMark;
import com.school.student.repository.TestMarkRepository;

@Service
public class TestMarkservice {
	@Autowired
	TestMarkRepository testMarkRepository;

	public TestMark createTestMark(TestMark testMark) {
		// TODO Auto-generated method stub
		return null;
	}

	public TestMark retriveTestMark() {
		// TODO Auto-generated method stub
		return null;
	}

}
