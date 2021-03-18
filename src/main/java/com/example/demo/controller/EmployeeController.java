package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee",produces= MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/insert")
    public void insert(@RequestBody Employee emp){
        employeeService.insert(emp);
    }

    @PutMapping("/update/{email}")
    public Employee update(@RequestBody Employee employee,@PathVariable String email){
        return employeeService.update(employee,email);
    }

    @GetMapping("/search")
    public Employee search(@RequestParam(value = "email")String email){
        return employeeRepository.findEmployeeByEmail(email);
    }
}
