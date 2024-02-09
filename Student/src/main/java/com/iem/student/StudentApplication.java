package com.iem.student;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iem.student.Service.StudentService;
import com.iem.student.model.Student;

@SpringBootApplication
public class StudentApplication  implements CommandLineRunner{
	@Autowired
	private StudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Student s = new Student();
		s.setName("anshu");
		s.setEnrollment("9053");
		s.setBranch("CSE");
		studentService.createStudent(s); 
	}


}
