package com.assimilate.data.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.data.jpa.model.Student;
import com.assimilate.data.jpa.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public int createStudent(Student student) {
		
		
	 studentRepository.save(student);
	
	return 0;
		
	}

	@Override
	public List<Student> getAll() {
		
		List<Student> student = studentRepository.findAll();
		
		
		return student;
	}

	@Override
	public void delete(int id) {
		
		studentRepository.deleteById(id);
		
	}

	@Override
	public Optional<Student>getByMyId(int id)
	{

		return studentRepository.findById(id);
	}

}
