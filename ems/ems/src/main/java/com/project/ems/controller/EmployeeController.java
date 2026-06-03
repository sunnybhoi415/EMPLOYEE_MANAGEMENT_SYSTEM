package com.project.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ems.dto.EmployeeDTO;
import com.project.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	
	@Autowired
	 EmployeeService es;
     public void setEs(EmployeeService es) {
		this.es = es;
	}
	 
     
     @GetMapping
     public List<EmployeeDTO> viewAll()
     {
    	return  es.viewAllEmp();
     }
     
     
     
     
     
     
     
	 

}
