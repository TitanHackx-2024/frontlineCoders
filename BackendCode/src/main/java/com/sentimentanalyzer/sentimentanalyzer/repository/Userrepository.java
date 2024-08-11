package com.sentimentanalyzer.sentimentanalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentimentanalyzer.sentimentanalyzer.entity.User;

public interface Userrepository extends JpaRepository<User,Long>  {
    
}
