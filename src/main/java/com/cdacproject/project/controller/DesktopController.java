package com.cdacproject.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesktopController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
