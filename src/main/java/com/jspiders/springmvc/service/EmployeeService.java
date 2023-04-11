package com.jspiders.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springmvc.pojo.EmployeePojo;
import com.jspiders.springmvc.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public EmployeePojo addEmployee(String name, String email, long contact, String designation, double salary) {
		EmployeePojo employee = repository.addEmployee(name, email, contact, designation, salary);
		return employee;
	}

	public EmployeePojo search(int id) {
		EmployeePojo employee=repository.searchEmployee(id);
		return employee;
	}

	public List<EmployeePojo> searchAllEmployees() {
		List<EmployeePojo> employees=repository.searchAllEmployees();
		return employees;
	}
	
	public void removeEmployee(int id) {
		repository.removeEmployee(id);
	}

	public List<EmployeePojo> searchAllEmployee() {
		List<EmployeePojo> employee=repository.searchAllEmployees();
		return employee;
	}

	public void updateEmployee(int id, String name, String email, long contact, String designation, double salary) {
		repository.updateEmployee(id,name,email,contact,designation,salary);
		
	}
	

}
