package com.sentimentanalyzer.sentimentanalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentimentanalyzer.sentimentanalyzer.entity.Comment;

public interface Commentrepository extends JpaRepository<Comment,Long> {
    
}
