package com.sentimentanalyzer.sentimentanalyzer.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

public class Result extends Baseentity {
    @OneToOne
    private Comment comment;

    @Enumerated(EnumType.ORDINAL)
    private Sentimentstatus sentimentstatus;
    
}
