package com.dailycodebuffer.controller;

import com.dailycodebuffer.entity.Employee;
import com.dailycodebuffer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") String employeeId)
    {
        return employeeRepository.getEmployeeById(employeeId);
    }

    //Method for deleteEmployee
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") String employeeId)
    {
        return employeeRepository.delete(employeeId);
    }
}
