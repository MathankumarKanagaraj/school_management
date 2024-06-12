package com.school.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.student.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
