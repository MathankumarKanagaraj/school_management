package com.school.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.student.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
	@Query("SELECT s FROM School s WHERE " + "(:name IS NULL OR s.name = :name) OR "
			+ "(:address IS NULL OR s.address = :address) OR " + "(:id IS NULL OR s.id = :id)")
	List<School> search(@Param("name") String name, @Param("address") String address, @Param("id") Long id);
}
