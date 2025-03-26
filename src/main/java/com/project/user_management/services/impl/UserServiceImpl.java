package com.project.user_management.services.impl;

import com.project.user_management.dto.UserDto;
import com.project.user_management.repository.UserRepository;
import com.project.user_management.repository.entity.UserEntity;
import com.project.user_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Collections;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String registerUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDto.getUsername());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setRole(userDto.getRole());
        userEntity.setCreatedOn(ZonedDateTime.now());
        userRepository.save(userEntity);
        return "Han Hogaya Save, chal nikal ab!!!";
    }
}
