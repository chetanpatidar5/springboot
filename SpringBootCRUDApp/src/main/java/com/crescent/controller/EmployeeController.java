package com.crescent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crescent.entity.Employee;
import com.crescent.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployeeData() {

		return employeeService.getEmployeeData();
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}
}
