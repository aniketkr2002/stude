package com.iemconnect.studentlog.service;

import org.springframework.stereotype.Service;

import com.iemconnect.studentlog.dao.StudentDao;
import com.iemconnect.studentlog.model.Student;

@Service
public class StudentService {
	private StudentDao studentDao;
	
	public Student createStudent(Student student) {
		return studentDao.save(student);
	}
	
}
