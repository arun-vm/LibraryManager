package com.good2code.exceptions;


public class EmployeeNotFoundException extends RuntimeException {
	
	
	public EmployeeNotFoundException(Long id){
		
		super("Could not found the employee "+id);
	}

}
