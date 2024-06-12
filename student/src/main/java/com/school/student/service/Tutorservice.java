package com.school.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.student.entity.Tutor;
import com.school.student.repository.TutorRepository;

@Service
public class Tutorservice {

	@Autowired
	TutorRepository tutorRepository;

	public Tutor createTutor(final Tutor tutor) {
		return this.tutorRepository.save(tutor);
	}

	public List<Tutor> retriveTutor() {
		return this.tutorRepository.findAll();
	}

}
