package com.school.student.service;

import com.school.student.entity.Student;
import com.school.student.entity.StudentAnswerSheet;
import com.school.student.entity.Test;
import com.school.student.entity.TestMark;
import com.school.student.repository.ChoiceRepository;
import com.school.student.repository.StudentAnswerRepository;

import com.school.student.repository.TestMarkRepository;

import java.util.HashMap;
import java.util.Map;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentAnswerService {

	@Autowired
	private StudentAnswerRepository studentAnswerSheetRepository;

	@Autowired
	private TestMarkRepository testMarkRepository;

	@Autowired
	private ChoiceRepository choiceRepository;

	@Transactional
	public Map<String, Object> saveStudentAnswerSheet(StudentAnswerSheet studentAnswerSheet)
			throws BadRequestException {
		Student student = studentAnswerSheet.getStudent();
		Test test = studentAnswerSheet.getTest();

		long points = this.choiceRepository.findById(studentAnswerSheet.getChoice().getId())
				.orElseThrow(() -> new BadRequestException("Choice not found")).getPoint();

		TestMark existingTestMark = testMarkRepository.findByStudentIdAndTestId(student.getId(), test.getId());

		if (existingTestMark != null) {

			existingTestMark.setPoints(existingTestMark.getPoints() + points);
			testMarkRepository.save(existingTestMark);
		} else {

			TestMark newTestMark = new TestMark();
			newTestMark.setStudent(student);
			newTestMark.setTest(test);
			newTestMark.setPoints(points);
			testMarkRepository.save(newTestMark);
		}

		StudentAnswerSheet answerSheet = this.studentAnswerSheetRepository.saveAndFlush(studentAnswerSheet);
		Map<String, Object> response = new HashMap<>();
		response.put("message", answerSheet);
		return response;
	}
}
