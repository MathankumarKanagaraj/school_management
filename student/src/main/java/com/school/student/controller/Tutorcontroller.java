package com.school.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.student.entity.Tutor;
import com.school.student.service.Tutorservice;

@RestController
@RequestMapping("/api")
public class Tutorcontroller {

	@Autowired
	Tutorservice tutorservice;

	@PostMapping("/tutor")
	public Tutor createTutor(@RequestBody Tutor tutor) {
		return this.tutorservice.createTutor(tutor);
	}

	@GetMapping("/tutor")
	public List<Tutor> retriveTutor() {
		return this.tutorservice.retriveTutor();
	}

}
