package com.example.demo1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entity.Employee;
import com.example.demo1.repository.EmployeeRepository;
import com.example.demo1.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
@Transactional // Agar Kuch Error Ayya Toh Roll Back Kar Dega
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	@Override
	public Employee createEmployee(Employee e) {
		return repo.save(e);
	}
	@Override
	public List<Employee> getAllEmp() {
		return repo.findAll();
	}
	@Override
	public boolean deleteEmployee(int id) {
		boolean b = repo.existsById(id);
		Employee e = repo.findById(id).orElse(null);
		if(e==null) return false;
		repo.deleteById(id);
		return true;
	}
	@Override
	public Employee updateEmployee(int id, Employee e) {
		Employee oldEmp = repo.findById(id).orElse(null);
		oldEmp.setName(e.getName());
		oldEmp.setEmail(e.getEmail());
		oldEmp.setContact(e.getContact());
		oldEmp.setGender(e.getGender());
		return repo.save(oldEmp);
	}
	
}
