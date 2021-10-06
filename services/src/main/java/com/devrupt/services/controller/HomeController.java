package com.devrupt.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/ping")
    public ResponseEntity<String> ping()
    {
        return ResponseEntity.ok("pong");
    }
}
