package com.school.student.repository;

import com.school.student.entity.StudentAnswerSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAnswerRepository extends JpaRepository<StudentAnswerSheet, Long> {
}
