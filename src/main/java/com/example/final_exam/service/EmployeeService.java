package com.example.final_exam.service;

import com.example.final_exam.entity.Employees;
import com.example.final_exam.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employees> findAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employees createEmployee(Employees employees) {
        return employeeRepo.save(employees);
    }

    @Override
    public Employees updateEmployee(Employees p) {
        return employeeRepo.save(p);
    }

    @Override
    public Employees getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
