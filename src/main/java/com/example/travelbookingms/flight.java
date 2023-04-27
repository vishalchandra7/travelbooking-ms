package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class flight {
    @GetMapping("/myflight")
    public String getData() {
        return "Please book your air ticket from cleartrip or goibibo";

    }
}
