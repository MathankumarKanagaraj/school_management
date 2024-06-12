package com.school.student.controller;

import java.util.Map;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.student.entity.StudentAnswerSheet;
import com.school.student.service.StudentAnswerService;

@RestController
@RequestMapping("/api")
public class StudentAnswerSheetController {

//	@Autowired StudentAnswerSheet studentAnswerSheet;

	@Autowired
	StudentAnswerService studentAnswerService;

	@PostMapping("/answer-sheet")
	public Map<String, Object> createAnswerSheet(@RequestBody StudentAnswerSheet answerSheet)
			throws BadRequestException {
		return this.studentAnswerService.saveStudentAnswerSheet(answerSheet);
	}

//	@GetMapping("/answersheet")
//	public List <StudentAnswerSheet> retriveAnswerSheet() {
//		return this.studentAnswerService.retriveAnswersheet();
//	}
}
