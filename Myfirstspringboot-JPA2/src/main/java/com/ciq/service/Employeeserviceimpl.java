package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.Employee;
import com.ciq.dao.EmployeeRepository;
@Service
public class Employeeserviceimpl implements Employeeservice {
@Autowired
public EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee); 
	}

	@Override
	public void deleteemployee(Employee employee) {
		employeeRepository.delete(employee);

	}

	@Override
	public Employee findbyid(Integer id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> findall() {
		return employeeRepository.findAll();
	}

}
