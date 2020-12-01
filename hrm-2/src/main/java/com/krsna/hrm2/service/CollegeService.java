package com.krsna.hrm2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krsna.hrm2.domain.College;
import com.krsna.hrm2.repository.CollegeRepository;

@Service
public class CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	
	public College getCollege(Long collegeId) {
		Optional<College> college = collegeRepository.findById(collegeId);
		if(college.isPresent()) {
			return college.get();
		}
		else {
			return null;
		}
	}
	
}
