package com.tdevs.d10cw1d5;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/health")
    public String getGreeting() {
        return "UP";
    }
}
