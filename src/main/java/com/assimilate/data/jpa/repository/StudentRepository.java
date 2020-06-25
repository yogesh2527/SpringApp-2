package com.assimilate.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.data.jpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	void delete(int id);
	
}
