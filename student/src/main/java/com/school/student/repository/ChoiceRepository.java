package com.school.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.student.entity.Choice;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Long> {

}
