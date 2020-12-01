package com.krsna.hrm2.dto;

import java.util.List;

import com.krsna.hrm2.domain.College;
import com.krsna.hrm2.domain.Student;

public class CollegeStudentDto {

	
	private College college;
	private List<Student> students;
	
	public void setCollege(College college) {
		this.college = college;
	}
	
	public College getCollege() {
		return college;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Student> getStudents() {
		return students;
	}
}
