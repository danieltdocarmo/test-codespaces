package com.codespace.codespace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class CodespaceController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
