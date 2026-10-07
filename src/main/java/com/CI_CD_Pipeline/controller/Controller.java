package com.CI_CD_Pipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Learn CI/CD Pipeline with Spring Boot");
    }
}
