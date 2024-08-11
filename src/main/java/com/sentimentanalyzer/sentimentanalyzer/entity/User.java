package com.sentimentanalyzer.sentimentanalyzer.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends Baseentity {
    private String name;
    private String email;
    private String password;
}
