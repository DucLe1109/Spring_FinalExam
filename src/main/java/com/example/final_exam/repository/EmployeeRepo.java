package com.example.final_exam.repository;

import com.example.final_exam.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employees,Integer> {
}
