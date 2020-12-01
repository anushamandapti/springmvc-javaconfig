package com.krsna.hrm2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krsna.hrm2.domain.Student;
import com.krsna.hrm2.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRespository;
	
	public Student createStudent(Student student) {
		Student dbStudent = studentRespository.save(student);
		return dbStudent;
	}
	
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRespository.findAll().forEach(students::add);
		return students;
	}
}
