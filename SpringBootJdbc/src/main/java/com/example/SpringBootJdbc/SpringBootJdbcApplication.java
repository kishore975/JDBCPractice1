package com.example.SpringBootJdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringBootJdbc.model.Student;
import com.example.SpringBootJdbc.service.StudentService;

@SpringBootApplication

public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJdbcApplication.class, args);
		System.out.println("Start");
		
		Student student=context.getBean(Student.class,args);
		
		student.setsId(104);
		student.setsName("K.Kishore");
		student.setsMarks(975);
		
		StudentService studentservice=context.getBean(StudentService.class, args);
		studentservice.addStudent(student);
		
		List<Student> stu=studentservice.getStudents(student);
				System.out.println(stu);
		
	}

}
