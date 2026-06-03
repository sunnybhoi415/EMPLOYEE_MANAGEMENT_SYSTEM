package com.project.ems.service;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ems.dto.EmployeeDTO;
import com.project.ems.entity.Employee;
import com.project.ems.mapper.EmployeeMapper;
import com.project.ems.repository.EmployeeReopsitory;

@Service
public class EmployeeServiceImpl implements EmployeeService
{    
	@Autowired
	EmployeeReopsitory er;
	

	public void setEr(EmployeeReopsitory er) {
		this.er = er;
	}


	@Override
	public List<EmployeeDTO> viewAllEmp() {
		
		/*
		List<Employee> allemp=er.findAll();
		
	     // to write this type code that convert the value first take in the employee and agin in to the Dto tp print tin to 
	     // used the java 8 function stream 
	      * 
	 	
		List<EmployeeDTO> allEmpDto=new ArrayList<EmployeeDTO>();
		
		for(Employee e:allemp)
		{
			EmployeeDTO edto=EmployeeMapper.mapToEmployeeDTO(e);
			allEmpDto.add(edto);
		}
		return allEmpDto;
		
		*/
		
		
		/*
		
		List<Employee> allemp=er.findAll();
		
	   Stream<Employee> s= allemp.stream();
	   Stream<EmployeeDTO> sdto=s.map((emp)->EmployeeMapper.mapToEmployeeDTO(emp));
	  List<EmployeeDTO> allempDto= sdto.collect(Collectors.toList())

       */
		
		
		List<Employee> allemp=er.findAll();
		
		return allemp.stream()
		.map((emp)->EmployeeMapper.mapToEmployeeDTO(emp))
		.collect(Collectors.toList());
		
	}
	
		

}
