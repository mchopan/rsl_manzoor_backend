package com.project_news.Controller;

import com.project_news.Entity.User;
import com.project_news.Service.UserServices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    ADD USER IN DATABASE
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

//    GET USER DETAILS
    @GetMapping("/getUser")
    public ArrayList<User> getUser(){
        return userService.getUser();
    }

//    GET USER BY ID
    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);
    }

//    DELETE USER
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable("id") Long userId){
        userService.deleteUserById(userId);
        return "User Deleted Successfully";
    }

//    UPDATE USER

    @PutMapping("/updateUser/{id}")
    public User updateUserById(@PathVariable("id") Long userId, @RequestBody User user){
        return userService.updateUserById(userId,user);
    }

}
