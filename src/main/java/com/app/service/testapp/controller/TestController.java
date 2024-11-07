package com.app.service.testapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/display")
    public ResponseEntity<String> display() {
        return ResponseEntity.ok("Hello World");
    }
}
