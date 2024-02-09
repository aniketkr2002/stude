package com.iem.student.model;



import javax.persistence.Table;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Table(name = "student_table")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    
	private String name;
	
	private String enrollment;
	
	private String branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Student() {}
	public Student(Integer id, String name, String enrollment, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.enrollment = enrollment;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", enrollment=" + enrollment + ", branch=" + branch + "]";
	}
	
}
