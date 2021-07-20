package com.crescent.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescent.entity.Employee;
import com.crescent.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepo employeeRepo;

	public List<Employee> getEmployeeData() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

}
