package com.iemconnect.studentlog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iemconnect.studentlog.model.Student;
import com.iemconnect.studentlog.service.StudentService;

@SpringBootApplication
public class StudentLogApplication implements CommandLineRunner {
	private StudentService studentService; 
	public static void main(String[] args) {
		SpringApplication.run(StudentLogApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Student s= new Student();
		s.setName("anshu");
		s.setRoll("11");
		studentService.createStudent(s);
		
	}

	
}
