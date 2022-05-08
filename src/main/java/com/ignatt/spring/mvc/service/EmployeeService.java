package com.ignatt.spring.mvc.service;

import com.ignatt.spring.mvc.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
