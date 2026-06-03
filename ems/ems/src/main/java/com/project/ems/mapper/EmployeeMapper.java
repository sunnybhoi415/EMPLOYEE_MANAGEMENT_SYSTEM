package com.project.ems.mapper;

import com.project.ems.dto.EmployeeDTO;
import com.project.ems.entity.Employee;

public class EmployeeMapper 
{
	
	// 1. Employee to Employee DTO
	// 2.Employee DTO to Employee
	
	
	public static Employee mapToEmployee(EmployeeDTO employeeDto)
	{
		Employee e=new Employee(employeeDto.getId(),employeeDto.getName(),employeeDto.getSalary(),employeeDto.getAddress());
		return e;
	}
	
	public static EmployeeDTO mapToEmployeeDTO(Employee employee)
	{
		return new EmployeeDTO(employee.getId(),employee.getName(),employee.getSalary(),employee.getAddress());
	}

}
