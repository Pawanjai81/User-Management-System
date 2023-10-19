package com.geekster.AssignmentUserManagement.controller;

import com.geekster.AssignmentUserManagement.Modal.User;
import com.geekster.AssignmentUserManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {

    @Autowired
    UserService userService;

    //post api
    @PostMapping("user")
    public String addUser(@RequestBody User newUser) {
        return userService.addUser(newUser);
    }

    //add multiple User at once;
    @PostMapping("users")
    public String addUsers(@RequestBody List<User> newUsers){
        return userService.addUsers(newUsers);
    }
    //get Api
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // get User by Id;
    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    //remove the user;
    @DeleteMapping("user/ids")
    public String removeuser(@RequestBody List<Integer> ids){
        return userService.removeUser(ids);
    }
}
