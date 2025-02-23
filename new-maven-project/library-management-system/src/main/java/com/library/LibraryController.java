package com.example; // Ensure this matches your main application package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String welcome(@RequestParam(required = false) String name) {
        String userName = (name == null || name.trim().isEmpty()) ? "Guest" : name;
        return "Hello, " + userName + "! Welcome to the Library Management System.";
    }
}
