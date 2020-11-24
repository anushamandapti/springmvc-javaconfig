package com.krsna.hrm2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krsna.hrm2.domain.Employee;
import com.krsna.hrm2.repository.EmployeeRespository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRespository employeeRepository;
	
	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployeeId(Integer employeeId) {
		return employeeRepository.findById(employeeId);
	}
	
	public void deleteEmployee(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}
}
