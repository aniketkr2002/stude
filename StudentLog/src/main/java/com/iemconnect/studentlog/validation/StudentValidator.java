package com.iemconnect.studentlog.validation;


import com.iemconnect.studentlog.model.Student;

public class StudentValidator{

    public static void validateStudent(Student student) {
        if (student == null || student.getName() == null || student.getRoll() == null ||  student.getBranch()==null || 
        		student.getPassword()==null ) {
            throw new IllegalArgumentException("Student object or its fields cannot be null");
        }
    }
}
