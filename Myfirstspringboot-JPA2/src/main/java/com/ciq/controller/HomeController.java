package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.bean.Employee;
import com.ciq.service.Employeeservice;

@RestController
public class HomeController {
	@Autowired
	public Employeeservice employeeservice;
	@GetMapping("/get")
	public  ModelAndView insert() {
		return new ModelAndView("home");	
	}
	@PostMapping("/saved")
	public ModelAndView saved(Employee employee) {
		employeeservice.saveEmployee(employee);
		return new ModelAndView("redirect:all");

	}
	@GetMapping("/all")
	public ModelAndView getll() {
		List<Employee> list = employeeservice.findall();
		System.out.println(list);
		return new ModelAndView("getall", "map", list);

	}
	@GetMapping("/edit")
	public ModelAndView update(@RequestParam Integer id) {
		Employee emp = employeeservice.findbyid(id);
		
		return new ModelAndView("editform", "dp", emp);

	}

	@PostMapping("/update")
	public ModelAndView modify(Employee employee) {
		Employee update = employeeservice.updateEmployee(employee);
		return new ModelAndView("redirect:all");

	
	}
}
