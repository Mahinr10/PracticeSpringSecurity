package com.example.basicsecure.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping("/view-all")
    public String getUsers() {
        return "sending All Users";
    }

    @GetMapping("/view/{id}")
    public String getUser(@PathVariable String id) {
        return "sending user with - " + id;
    }
}
