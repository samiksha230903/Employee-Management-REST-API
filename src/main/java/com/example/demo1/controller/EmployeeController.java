package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entity.Employee;
import com.example.demo1.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
  @Autowired
  private  EmployeeService employeeService;
  @GetMapping()
  public List<Employee> getAllEmployee() {
    return employeeService.getAllEmp();
  }
  @GetMapping("yo")
  public String data() {
    return "data";
  }
  @PostMapping
  public Employee createEmployee(@RequestBody Employee e) {
    return employeeService.createEmployee(e);
  }
  @DeleteMapping("/{id}")
  public String deleteEmp(@PathVariable int id) {
    boolean b = employeeService.deleteEmployee(id);
    if (b) {
      return "Employee Deleted Successfully";
    }
    return "Employee Not Found For This Id: "+id;
  }
  @PutMapping("/{id}")
  public Employee updateEmployee(@PathVariable int id, @RequestBody Employee e) {
    return employeeService.updateEmployee(id,e);
  }
}