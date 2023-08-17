package com.peterjxl.learnspringbootprofile.controller;

import com.peterjxl.learnspringbootprofile.bean.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    Color color;

    @Value("${person.name:Peter}") // If person.name is not defined, use "Peter" as default
    private String name;

    @GetMapping("/")
    public String sayHello() {
        return "Hello " + name + color;
    }
}
