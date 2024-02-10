package com.iemconnect.studentlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iemconnect.studentlog.model.Student;
import com.iemconnect.studentlog.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
}
