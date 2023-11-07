package com.example.SocialMediaApplication.controller;

import com.example.SocialMediaApplication.model.Users;
import com.example.SocialMediaApplication.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserService userservice;
    @GetMapping("/users")
    public List<Users> finAllUsers(){
        return  userservice.finAllUsers();
    }
    @GetMapping("/users/{id}")
    public Users findUserById(@PathVariable  int id)
    {
        return userservice.findUserById(id);
    }
    @PostMapping("/users")
    public Users save(@RequestBody Users user)
    {
        return userservice.save(user);
    }
    @PutMapping("/users/{id}")
    public Users save(@RequestBody Users user,@PathVariable int id)
    {
        return userservice.updateUser(user,id);
    }
    @DeleteMapping("/users/{id}")
    public boolean deleteUserById(@PathVariable int id)
    {
        userservice.deleteUserById(id);
        return true;
    }


}
