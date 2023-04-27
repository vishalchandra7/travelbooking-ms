package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class holidaypackage {
    @GetMapping("/holidaypackage")
    public String getData() {
        return "Please enjoy  your holday  package";
    }
}