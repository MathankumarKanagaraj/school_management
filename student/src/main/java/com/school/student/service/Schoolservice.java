package com.school.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.school.student.entity.School;
import com.school.student.repository.SchoolRepository;

@Service
public class Schoolservice {
	@Autowired
	SchoolRepository SchoolRepasitory;

	public School createSchool(School school) {

		return this.SchoolRepasitory.save(school);
	}

	public List<School> retriveschool() {
		return this.SchoolRepasitory.findAll();
	}
	public Page<School> retriveschools(int page,int size) {
		return this.SchoolRepasitory.findAll(PageRequest.of(page, size));
	}
	
	public List<School> searchSchools(String name,String address, Long id){
		return SchoolRepasitory.search(name,address,id);
	}
}
