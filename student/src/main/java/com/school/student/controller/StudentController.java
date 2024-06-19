package com.school.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.student.DTO.PaginatedResponseDTO;
import com.school.student.DTO.StudentResponsedto;
import com.school.student.entity.Student;
import com.school.student.service.Studentservice;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	Studentservice studentService;

	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return this.studentService.createStudent(student);
	}

//	@GetMapping("/student")
//	public List<StudentResponsedto> retriveStudent() {
//		return this.studentService.retriveStudent();
//	}

	@GetMapping("/students")
	public PaginatedResponseDTO<StudentResponsedto> StudentData(@RequestParam int page, @RequestParam int size) {
		return this.studentService.StudentData(page, size);
	}
// localhost:8080/api/students?page=3&size=6  params  
	
	@GetMapping("/students/search")
	public List<StudentResponsedto> serchStudents(@RequestParam String name) {
		return studentService.searchStudent(name);
	}

	@GetMapping("/student")
	public List<StudentResponsedto> retriveStudent() {
		return studentService.retriveStudent();
	}
}
