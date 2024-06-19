package com.school.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.student.DTO.LoginDTO;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<LoginDTO, Long> {
    Optional<String> findByUsername(String username);
}