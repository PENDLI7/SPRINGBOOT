package com.ciq.service;

import java.util.List;

import com.ciq.bean.Employee;

public interface Employeeservice {
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
void deleteemployee(Employee employee);
Employee findbyid(Integer id);
List<Employee>findall();
}
