package com.ignatt.spring.mvc.dao;

import com.ignatt.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
