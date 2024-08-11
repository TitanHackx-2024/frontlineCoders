package com.sentimentanalyzer.sentimentanalyzer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sentimentanalyzer.sentimentanalyzer.dto.UserDto;
import com.sentimentanalyzer.sentimentanalyzer.service.Userdtoconvater;
import com.sentimentanalyzer.sentimentanalyzer.service.Userservice;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    private static final String U = null;

    @Autowired
    Userservice userservice;

    @Autowired
    Userdtoconvater userdtoconvater;
   
    @PostMapping("/creatuser")
    public UserDto creatUser(@RequestBody UserDto userDto) {
        User user =(User) userdtoconvater.getUser(userDto);
        User user2= (User) userservice.creatUser(user);
        UserDto userDto2 =userdtoconvater.getDto(user2);
        return userDto2;
    }
    
}
