package com.exam.examserver.controller;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setRole("NORMAL");
        roles.add(role);
        return userService.createUser(user,roles)  ;
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String userName){
        return userService.getUser(userName);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser (@PathVariable("userId") Long id){
        userService.deleteUser(id);
    }


}
