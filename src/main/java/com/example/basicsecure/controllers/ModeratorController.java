package com.example.basicsecure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/moderator")
public class ModeratorController {

    @GetMapping("/view-all")
    public String getModerators() {
        return "sending all moderators";
    }

    @GetMapping("/view/{id}")
    public String getModerator(@PathVariable String id) {
        return "sending moderator : " + id;
    }
}
