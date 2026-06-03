package com.project.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ems.entity.Employee;

public interface EmployeeReopsitory  extends JpaRepository<Employee,Integer>{

}
