package com.good2code.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.good2code.exceptions.EmployeeNotFoundException;

@ControllerAdvice
public class EmployeeAdvice {

	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	String employeeHandler(EmployeeNotFoundException employeeNotFoundException) {
		
		return employeeNotFoundException.getMessage();
	}
}

