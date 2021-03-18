package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void insert(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee update(Employee employee, String email){
        return employeeRepository.findEmployeeByEmail(email);
    }
}
