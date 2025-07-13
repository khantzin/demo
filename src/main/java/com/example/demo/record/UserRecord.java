package com.example.demo.record;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserRecord {
    private String name;
    private String email;
    private String address;
    private String uuid;
}
