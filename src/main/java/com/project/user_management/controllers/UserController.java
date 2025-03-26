package com.project.user_management.controllers;

import com.project.user_management.dto.UserDto;
import com.project.user_management.repository.UserRepository;
import com.project.user_management.repository.entity.UserEntity;
import com.project.user_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDto userDto){
        return userService.registerUser(userDto);
    }

}
