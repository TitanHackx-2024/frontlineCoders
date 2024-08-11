package com.sentimentanalyzer.sentimentanalyzer.entity;

import jakarta.persistence.ManyToOne;

public class Comment extends Baseentity {
   @ManyToOne
   private Post post;
   private String massage;
}
