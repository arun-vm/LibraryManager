package com.good2code.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.good2code.exceptions.EmployeeNotFoundException;
import com.good2code.model.Employee;
import com.good2code.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private final EmployeeRepository employeeRepository;

	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@GetMapping("/employees")
	public List<Employee> all() {

		return employeeRepository.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee one(@PathVariable Long id) {

		return employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException(id));
	}

}
