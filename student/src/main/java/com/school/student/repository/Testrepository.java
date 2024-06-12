package com.school.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.student.entity.Test;

@Repository
public interface Testrepository extends JpaRepository<Test, Long> {

}
