package com.school.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.student.entity.Choice;
import com.school.student.service.ChoiceService;

@RestController
@RequestMapping("/api")
public class ChoiceController {

	@Autowired
	ChoiceService choiceService;

	@PostMapping("/choice")
	public Choice createChoice(@RequestBody Choice choice) {
		return this.choiceService.createChoice(choice);
	}

	@GetMapping("/choice")
	public List<Choice> retriveChoice() {
		return this.choiceService.retriveChoice();
	}
}