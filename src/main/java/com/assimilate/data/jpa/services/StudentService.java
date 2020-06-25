package com.assimilate.data.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assimilate.data.jpa.model.Student;

@Service
public interface StudentService {

	int createStudent(Student student);

	List<Student> getAll();

	void delete(int id);

	Optional<Student> getByMyId(int id);

}
