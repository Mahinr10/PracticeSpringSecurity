package com.example.basicsecure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")
public class AdminController {

    @GetMapping("/view-all")
    public String getAdmins() {
        return "sending all admins";
    }

    @GetMapping("/view/{id}")
    public String getAdmin(@PathVariable  String id) {
        return "sending admin with id: " + id;
    }
}
