package com.wb.springboot2skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {
    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
