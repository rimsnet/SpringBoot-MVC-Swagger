package com.rimsan.springboot.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rimsan.springboot.demo.model.Employee;
import com.rimsan.springboot.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeByEmpId(String empId) {
		
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setFirstName("Mohamed");
		employee.setLastName("Rimsan");
		employee.setSsn("455263");

		return employee;

	}

	@Override
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> empList = new ArrayList<>();

		Employee employee = new Employee();
		employee.setEmpId("10002");
		employee.setFirstName("Fathima");
		employee.setLastName("Asma");
		employee.setSsn("785236");

		Employee employee1 = new Employee();
		employee1.setEmpId("1011");
		employee1.setFirstName("Fathi");
		employee1.setLastName("Amanee");
		employee1.setSsn("123-45-6789");

		Employee employee2 = new Employee();
		employee2.setEmpId("1072");
		employee2.setFirstName("Mohamed");
		employee2.setLastName("Asir");
		employee2.setSsn("123-45-6789");

		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);

		return empList;
	}

}
