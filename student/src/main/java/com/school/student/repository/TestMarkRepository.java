package com.school.student.repository;

import com.school.student.entity.TestMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMarkRepository extends JpaRepository<TestMark, Long> {
	TestMark findByStudentIdAndTestId(Long studentId, Long testId);
}
