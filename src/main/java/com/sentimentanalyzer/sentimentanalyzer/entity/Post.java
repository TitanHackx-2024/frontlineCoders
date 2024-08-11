package com.sentimentanalyzer.sentimentanalyzer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post extends Baseentity{
    
    @ManyToOne
    private User user;

    private String post_link;

    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
