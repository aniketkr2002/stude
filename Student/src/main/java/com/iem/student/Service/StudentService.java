package com.iem.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iem.student.Dao.Studentdao;
import com.iem.student.model.Student;

@Service
public class StudentService {
	@Autowired
	private Studentdao studentdao ;// created obj ;

	
	//retrieve all student details and return cursor
	public Iterable<Student> getAllStudents(){
		return studentdao.findAll();
	}
	public Student createStudent(Student student) {
		return studentdao.save(student);
	}
	
	
	
}
