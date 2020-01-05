package com.cdacproject.project.controller;

import com.cdacproject.project.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DesktopController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping("/")
    public ModelAndView home(){
        Map params = new HashMap<String, Object>();
        return new ModelAndView("home", params);
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }




}
