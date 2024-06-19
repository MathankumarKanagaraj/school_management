package com.school.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.student.DTO.StudentResponsedto;
import com.school.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//	@Query("SELECT s FROM Student s WHERE " + "(s.id IS NULL OR s.id = :id) OR "
//			+ "(s.name IS NULL OR s.name = :name)")
//	List<StudentResponsedto> searchStudent(@Param("id") Integer id, @Param("name") String name);
	
	@Query("SELECT s FROM Student s WHERE " + "(s.name IS NULL OR s.name LIKE %:name%)")
	List<Student> searchStudent(@Param("name") String name);

}
