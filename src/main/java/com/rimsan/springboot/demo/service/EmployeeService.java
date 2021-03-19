package com.rimsan.springboot.demo.service;

import java.util.List;

import com.rimsan.springboot.demo.model.Employee;

public interface EmployeeService {
    
	 public Employee getEmployeeByEmpId(String empId);
	 
	 public List<Employee> getAllEmployees();
	 
}
