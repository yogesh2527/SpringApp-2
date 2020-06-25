package com.assimilate.data.jpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.data.jpa.model.Student;
import com.assimilate.data.jpa.services.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController{

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/createStudent")
	public String createStudent(@RequestBody Student student)
	{
		int result = studentService.createStudent(student);
		
		return "Student is created";
	}
	
	@RequestMapping("/getAll")
	public List<Student> getAllStudent()
	{
		List<Student>student =	studentService.getAll();
		
		return student;
	}
	
	@RequestMapping(path="/delete/{id}" , method = RequestMethod.DELETE)
	public String deleteById(@PathVariable("id") int id)
	{
		
			studentService.delete(id);
			
		return "Student is deleted";
	}
	
	@RequestMapping(path="/getById/{id}" , method = RequestMethod.GET)
	public Optional<Student> getById(@PathVariable("id") int id)
	{
		Optional<Student> student = studentService.getByMyId(id);
		
		
		return student;
	}
}
