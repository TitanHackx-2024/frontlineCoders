package com.sentimentanalyzer.sentimentanalyzer.service;

import org.springframework.stereotype.Service;

import com.sentimentanalyzer.sentimentanalyzer.dto.Dto;
import com.sentimentanalyzer.sentimentanalyzer.dto.UserDto;
import com.sentimentanalyzer.sentimentanalyzer.entity.User;

@Service
public class Userdtoconvater {
    

    public User getUser(UserDto userDto){
        User user =new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        userDto.setPassword(userDto.getPassword());
        return user; 
    }

    public UserDto getDto(org.apache.catalina.User user){
        UserDto userDto =new UserDto();
        userDto.setId(((Dto) user).getId());
        userDto.setEmail(((UserDto) user).getEmail());
        userDto.setName(user.getPassword());
        userDto.setPassword(user.getPassword());
        return userDto; 
    }
}
