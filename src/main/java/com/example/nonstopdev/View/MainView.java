package com.example.nonstopdev.View;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainView {
    @GetMapping
    public String main() {
        return "Hello World!2";
    }
}
