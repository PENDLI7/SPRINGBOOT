package com.ciq;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.bean.Employee;
import com.ciq.controller.HomeController;
import com.ciq.service.Employeeservice;

@SpringBootTest
class MyfirstspringbootJpa2ApplicationTests {
	@Autowired
	Employeeservice employeeservice;
	@Test
	void contextLoads() {
		employeeservice.saveEmployee(new Employee(1,  "jithu", "Manager", 10, "java"));
	}

}
