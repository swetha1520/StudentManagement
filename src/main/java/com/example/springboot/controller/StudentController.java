package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.springboot.models.StudentModel;
import com.example.springboot.services.StudentService;

@RestController
public class StudentController {
 
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAllstudents")
	public List<StudentModel> getAllStudents()
	{
		 return studentService.getAllStudents();
	}
	@RequestMapping("/getstudent/{id}")
	public StudentModel getStudent(@PathVariable int id)
	{
		 return studentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addstudent")
	public void addStudent(@RequestBody StudentModel student)
	{
		studentService.addStudent(student);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/updatestudent/{id}")
	public void updateStudent(@RequestBody StudentModel student,@PathVariable int id)
	{
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deletestudent/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}
	
}
