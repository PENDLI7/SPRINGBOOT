package com.ciq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
