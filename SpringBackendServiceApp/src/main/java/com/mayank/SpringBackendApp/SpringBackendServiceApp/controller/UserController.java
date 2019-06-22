package com.mayank.SpringBackendApp.SpringBackendServiceApp.controller;

import com.mayank.SpringBackendApp.SpringBackendServiceApp.service.UserService;
import com.mayank.SpringBackendApp.SpringBackendServiceApp.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findUserbyId(id);
    }

    @PostMapping("/user")
    public User createNewUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/user")
    public Boolean updateExisitingUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUserbyId(Long id){
        return userService.deleteUser(id);
    }

    

}
