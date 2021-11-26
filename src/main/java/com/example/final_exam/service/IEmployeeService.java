package com.example.final_exam.service;

import com.example.final_exam.entity.Employees;

import java.util.List;

public interface IEmployeeService {
    List<Employees> findAllEmployees();
    Employees createEmployee(Employees employees);
    Employees updateEmployee(Employees p);
    Employees getEmployeeById(int id);
    void deleteEmployee(int id);
}
