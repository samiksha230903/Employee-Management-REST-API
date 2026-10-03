package com.example.demo1.service;

import java.util.List;

import com.example.demo1.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee e);

	List<Employee> getAllEmp();

	boolean deleteEmployee(int id);

	Employee updateEmployee(int id, Employee e);

}
