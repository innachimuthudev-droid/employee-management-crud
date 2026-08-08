package com.project.employeemanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employeemanagement.model.Employee;
import com.project.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController 
{
    private EmployeeService service;
    EmployeeController(EmployeeService service)
    {
        this.service=service;
    }

    @GetMapping("/employee")
    public String  welcome()
    {
        return "EMPLOYEE MANAGEMENT SYSTEM";
    }
    @GetMapping("/employee/view")
    public List<Employee> viewEmployeee()
    {
        return service.viewEmployeee();
    }
    @PostMapping("/employee/add")
    public Employee setEmployees(@RequestBody Employee emp)
    {
        return service.addEmployee(emp);
        
    }
    @GetMapping("/employee/search/{id}")
    public String getEmployeeById(@PathVariable int id)
    {
        return service.getEmployeeById(id);
    
    }
    @DeleteMapping("/employee/delete/{id}")
    public void  deleteEmployee(@PathVariable int id)
    {
        service.deleteEmployeeById(id);
       
    }
    @PutMapping("/employee/update")
    public Employee updateEmployeeById(@RequestBody Employee emp)
    {
        return service.updateEmployeeById(emp);
    
    }
}
