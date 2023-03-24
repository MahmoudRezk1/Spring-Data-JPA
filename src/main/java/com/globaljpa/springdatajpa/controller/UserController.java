package com.globaljpa.springdatajpa.controller;

import com.globaljpa.springdatajpa.entity.User;
import com.globaljpa.springdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(path = "/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}

