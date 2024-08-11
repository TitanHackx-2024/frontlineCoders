package com.sentimentanalyzer.sentimentanalyzer.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends Dto {
    private String name;
    private String email;
    private String password;

}
