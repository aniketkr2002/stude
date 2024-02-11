package com.iemconnect.studentlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iemconnect.studentlog.dao.StudentDao;
import com.iemconnect.studentlog.model.Student;

@Service
public class StudentService {
	
	@Autowired(required = false)
	private StudentDao studentDao;
	
	public Student createStudent(Student student) {
		return studentDao.save(student);
	}

	public Iterable<Student> getAllSudent() {
		return studentDao.findAll();
	}
	
}
