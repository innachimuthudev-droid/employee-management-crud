package com.project.employeemanagement.service;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.project.employeemanagement.model.Employee;
import com.project.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private EmployeeRepository repo;

    EmployeeService(EmployeeRepository repo)
    {
        this.repo=repo;
    }
    public List<Employee> viewEmployeee()
    {
        return repo.findAll();
    }
    public Employee addEmployee(Employee emp)
    {
        return repo.save(emp);
    }
    public String  getEmployeeById(int id)
    {
        Employee obj=repo.findById(id).orElse(null);
        if(obj==null)
        {
            return "Employee not found...";
        }
        else
        {
            return obj.toString();
        }
    }
    public void deleteEmployeeById(int id)
    {
        try
        {
            repo.deleteById(id);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("invalid id number..");
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
    }
    public Employee updateEmployeeById(Employee emp)
    {
        return repo.save(emp);
    }

}
