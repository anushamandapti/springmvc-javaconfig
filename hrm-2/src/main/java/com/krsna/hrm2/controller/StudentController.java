package com.krsna.hrm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.krsna.hrm2.dto.AddressDto;
import com.krsna.hrm2.dto.StudentDto;
import com.krsna.hrm2.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService  studentService;
	
	
	@GetMapping(value="/student/list")
	public ModelAndView showAllStudents() {
		System.out.println("StudentController.showAllStudents()");
		ModelAndView mv = new ModelAndView();
		//View
		mv.setViewName("student/list");
		//Model -- List of students
		//Model -- List of orders
		//Model -- Employee details(firstname, lastname...) and his accounts
		
		AddressDto addressDto = new AddressDto();
		addressDto.setCity("vizag");
		addressDto.setPincode("530016");
		
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentName("rk");
		studentDto.setAddress(addressDto);
		
		mv.addObject("STUD_DTLS", studentDto);
		return mv;
	}
	
}
