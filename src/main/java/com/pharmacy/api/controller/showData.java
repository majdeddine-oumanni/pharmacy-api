package com.pharmacy.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class showData {
    @GetMapping("/")
    public String test() {
        return "[hello, boba]";
    }
}