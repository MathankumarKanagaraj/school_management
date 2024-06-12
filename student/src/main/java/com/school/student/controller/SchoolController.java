package com.school.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.student.entity.School;
import com.school.student.service.Schoolservice;

@RestController
@RequestMapping("/api")
public class SchoolController {

	@Autowired
	Schoolservice schoolservice;

	@PostMapping("/school")
	public School createSchool(@RequestBody School school) {
		return this.schoolservice.createSchool(school);
	}

	@GetMapping("/school")
	public List<School> retriveschool() {
		return this.schoolservice.retriveschool();

	}

	@GetMapping("/schools")
	public Page<School> retriveschools(@RequestParam int page, @RequestParam int size) {
		return this.schoolservice.retriveschools(page, size);

	}
	 @GetMapping("/schools/search")
	    public List<School> searchSchools(@RequestParam(required = false) String name,
	                                      @RequestParam(required = false) String address,
	                                      @RequestParam(required = false) Long id) {
	        return schoolservice.searchSchools(name, address, id);
}
}
