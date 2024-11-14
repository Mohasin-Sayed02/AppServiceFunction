package com.app.service.testapp.controller;

import com.app.service.testapp.model.Employee;
import com.app.service.testapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/display")
    public ResponseEntity<String> display() {
        return ResponseEntity.ok("Hello World 01");
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Employee user) {
        employeeRepository.save(user);
        return ResponseEntity.ok("Data saved successfully");
    }
}
