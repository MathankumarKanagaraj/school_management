package com.school.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.student.entity.Test;
import com.school.student.service.Testservice;

@RestController
@RequestMapping("/api")
public class Testcontroller {

	@Autowired
	Testservice testservice;

	@PostMapping("/test")
	public Test createTest(@RequestBody Test test) {
	return testservice.createTest(test);
}

	@GetMapping("/test")
	public List<Test> retriveTest(Test test) {
	  return this.testservice.retriveTest(test);
}

}
