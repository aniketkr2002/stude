package com.iemconnect.studentlog.dao;

import org.springframework.data.repository.CrudRepository;

import com.iemconnect.studentlog.model.Student;

public interface StudentDao extends CrudRepository<Student,Integer> {
	
}
