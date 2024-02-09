package com.iem.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iem.student.Service.StudentService;
import com.iem.student.model.Student;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	//Rest 
	
	@PostMapping(value="/create")
	public Student createStudent(@RequestBody Student stu_input) {
		return  studentService.createStudent(stu_input);
	}
	@GetMapping(value="/all")
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
}
