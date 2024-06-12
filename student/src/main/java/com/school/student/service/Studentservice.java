package com.school.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.school.student.DTO.PaginatedResponseDTO;
import com.school.student.DTO.StudentResponsedto;
import com.school.student.entity.Student;
import com.school.student.repository.StudentRepository;

@Service
public class Studentservice {

	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(final Student student) {
		return studentRepository.save(student);
	}

	public PaginatedResponseDTO<StudentResponsedto> StudentData(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Student> studentPage = studentRepository.findAll(pageable);

		List<StudentResponsedto> studentResponseList = new ArrayList<>();
		for (Student student : studentPage) {
			StudentResponsedto dto = new StudentResponsedto();
			dto.setId(student.getId());
			dto.setName(student.getName());
			dto.setSchoolId(student.getSchool().getId());
			studentResponseList.add(dto);
		}

		PaginatedResponseDTO<StudentResponsedto> responseDTO = new PaginatedResponseDTO<>();
		responseDTO.setContent(studentResponseList);
		responseDTO.setPageNumber(studentPage.getNumber());
		responseDTO.setPageSize(studentPage.getSize());
		responseDTO.setTotalElements(studentPage.getTotalElements());
		responseDTO.setTotalPages(studentPage.getTotalPages());

		return responseDTO;
	}

    public List<StudentResponsedto> searchStudent( String name) {
        return studentRepository.searchStudent(name);
    }



	public List<StudentResponsedto> retriveStudent() {               //DTO
//	return studentRepository.findAll();
		List<Student> data = this.studentRepository.findAll();
		List<StudentResponsedto> resList = new ArrayList<>();
		for(Student student: data){
			StudentResponsedto temp = new StudentResponsedto();
			temp.setId(student.getId());
			temp.setName(student.getName());
			temp.setSchoolId(student.getSchool().getId());
			resList.add(temp);
		}
		return resList;	
	}

}
