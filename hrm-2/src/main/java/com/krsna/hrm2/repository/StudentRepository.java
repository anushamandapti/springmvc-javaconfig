package com.krsna.hrm2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krsna.hrm2.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	
}
