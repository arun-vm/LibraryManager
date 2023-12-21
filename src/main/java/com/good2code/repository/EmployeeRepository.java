package com.good2code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.good2code.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
