package com.iem.student.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iem.student.model.Student;
//crud
@Repository
public interface Studentdao extends CrudRepository<Student,Integer> {

}
