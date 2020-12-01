package com.krsna.hrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.krsna.hrm2.domain.College;
import com.krsna.hrm2.domain.Student;
import com.krsna.hrm2.service.CollegeService;
import com.krsna.hrm2.service.StudentService;

@Controller
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/collegestudents")
	public ModelAndView getCollegeStudents() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("college/home");
		
		//MODEL ? CollegeStudentDto
		//College + List of students
		College college = collegeService.getCollege(1l);
		if(college != null)
		mv.addObject("COLLEGE", college);
		
		List<Student> students = studentService.getAllStudents();
		mv.addObject("COLLEGE_STUDENTS", students);
		return mv;
	}
}
