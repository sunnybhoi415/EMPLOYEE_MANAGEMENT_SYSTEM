package com.project.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeResourceNotFoundException extends Exception 
{
	public EmployeeResourceNotFoundException(String msg)
	{
		super(msg);
	}
	

}
