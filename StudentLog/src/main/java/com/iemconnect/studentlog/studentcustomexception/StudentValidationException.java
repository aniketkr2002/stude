package com.iemconnect.studentlog.studentcustomexception;


public class StudentValidationException extends RuntimeException {
    public StudentValidationException(String message) {
        super(message);
    }
}

