package com.example.travelbookingms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class train {
    @GetMapping("/mytrainl")
    public String getData() {
        return "Please book your train ticket";
    }
}