package com.cdacproject.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AuthenticationService {

    public boolean login(String username, String password){
        return false;
    }

    public boolean register(Map<String,String> details){
        return false;
    }
}
