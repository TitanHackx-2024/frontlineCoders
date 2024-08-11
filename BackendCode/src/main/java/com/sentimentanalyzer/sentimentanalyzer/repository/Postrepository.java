package com.sentimentanalyzer.sentimentanalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentimentanalyzer.sentimentanalyzer.entity.Post;

public interface Postrepository extends JpaRepository<Post,Long> {
    
}
