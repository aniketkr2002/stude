package com.iemconnect.studentlog.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iemconnect.studentlog.model.Student;
import com.iemconnect.studentlog.service.StudentService;
import com.iemconnect.studentlog.studentcustomexception.StudentValidationException;
import com.iemconnect.studentlog.validation.StudentValidator;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/create")
	public Student createStudent(@RequestBody Student student) {
		 try {
	            StudentValidator.validateStudent(student);
	            return studentService.createStudent(student);
	        } catch (IllegalArgumentException e) {
	            throw new StudentValidationException("Please provide all details of the student.");
	        }
		//return studentService.createStudent(student);
	}
	@GetMapping(value = "/all")
	public Iterable<Student> getAllStudent(){
		return studentService.getAllSudent();

	}
	@ExceptionHandler(StudentValidationException.class)
    public String handleStudentValidationException(StudentValidationException ex) {
        return ex.getMessage();
    }
}
