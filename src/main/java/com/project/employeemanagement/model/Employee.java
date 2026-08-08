package com.project.employeemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee 
{
    @Id
    private int id;
    private String name;
    private String role;
    private String status;
    private int experience;
    private double salary;
    
}
