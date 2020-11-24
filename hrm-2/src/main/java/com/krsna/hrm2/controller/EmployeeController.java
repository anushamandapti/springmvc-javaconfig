package com.krsna.hrm2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.krsna.hrm2.domain.Employee;
import com.krsna.hrm2.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/")
	public ModelAndView index() {
		System.out.println("EmployeeController.index()");
//		List<Employee> employeeList = new ArrayList<>();
//		Employee e1 = new Employee();
//		e1.setFirstName("abc");
//		e1.setLastName("xyz");
//		e1.setEmail("abc@gmail.com");
//		e1.setId(1);
//		
//		Employee e2 = new Employee();
//		e2.setFirstName("hello");
//		e2.setLastName("xyz");
//		e2.setEmail("hello@gmail.com");
//		e2.setId(2);
//		
//		employeeList.add(e1);
//		employeeList.add(e2);
		
		Iterable<Employee> employeeList = employeeService.getAllEmployees();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employee/index");
		mv.addObject("EMP_LIST", employeeList);
		return mv;
	}
	
	@GetMapping(value = "/create")
	public String showCreateEmployeeForm(Model model) {
		System.out.println("EmployeeController.createEmployee()");
		model.addAttribute("employee", new Employee());
		return "employee/create";
	}
	
	@PostMapping(value = "/create")
	public String createEmployee(@ModelAttribute("employee") Employee employee, BindingResult result) {
		System.out.println("EmployeeController.createEmployee()"+employee.toString());
		employeeService.createEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping(value = "/edit/{id}")
	public String showEditEmployeeForm(@PathVariable("id") Integer employeeId, Model model) {
		System.out.println("EmployeeController.showEditEmployeeForm()");
		Optional<Employee> dbEmployee = employeeService.getEmployeeId(employeeId);
		if(dbEmployee.isPresent()) {
			model.addAttribute("employee", dbEmployee.get());
		}
		
		return "employee/edit";
	}
	
	@PostMapping(value = "/edit")
	public String editEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println("EmployeeController.editEmployee()");
		employeeService.createEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping(value = "/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "redirect:/";
	}
}
