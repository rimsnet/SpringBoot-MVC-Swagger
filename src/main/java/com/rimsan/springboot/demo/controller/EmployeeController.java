package com.rimsan.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rimsan.springboot.demo.model.Employee;
import com.rimsan.springboot.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee/{empId}")
	public ResponseEntity<Object> getEmployee(@PathVariable String empId){

		Employee employeeResponse = employeeService.getEmployeeByEmpId(empId);

		return new ResponseEntity<Object>(employeeResponse, HttpStatus.OK);
	}

	@GetMapping("/employees")
	public ResponseEntity<Object> getAllEmployees(){
		
		 List<Employee> empResponse = employeeService.getAllEmployees();

		return new ResponseEntity<Object>(empResponse, HttpStatus.OK);
	}

}
