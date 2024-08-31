package com.example.SpringBootJdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootJdbc.model.Student;
import com.example.SpringBootJdbc.repo.StudentRepository;

@Service
public class StudentService 
{
	
	private StudentRepository studentrespository;
	public StudentRepository getStudentrespository() {
		return studentrespository;
	}
	@Autowired
	public void setStudentrespository(StudentRepository studentrespository) {
		this.studentrespository = studentrespository;
	}
	public void addStudent(Student student) 
	{
		
		studentrespository.save(student);
	}
	public List<Student> getStudents(Student student) 
	{
		return studentrespository.findAll();
	}
	

}
