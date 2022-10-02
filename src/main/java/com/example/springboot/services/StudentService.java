package com.example.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.springboot.models.StudentModel;
import com.example.springboot.repositories.StudentRepository;

@Service
public class StudentService  {

  @Autowired
  private StudentRepository studentRepository;
  
  public List<StudentModel> getAllStudents()
  {
	  return studentRepository.findAll();
  }
  
  public StudentModel getStudent(int id)
  {
	  return studentRepository.findById(id).orElse(null);
  }
  public void addStudent(StudentModel student)
  {
	   studentRepository.save(student);
  }
  
  
  public void updateStudent(int id,StudentModel student)
  {
	  studentRepository.save(student);
  }
  public void deleteStudent(int id)
  {
	  studentRepository.deleteById(id);
  }
  
}
