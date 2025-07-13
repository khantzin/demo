package com.example.demo.controller;

import com.example.demo.record.UserRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return new UserRecord("Kaolin", "kaolin@gmail.com", "123 Main St", UUID.randomUUID().toString())
                .toString();
    }
}
