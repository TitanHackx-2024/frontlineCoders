package com.sentimentanalyzer.sentimentanalyzer.service;

import org.springframework.stereotype.Service;

import com.sentimentanalyzer.sentimentanalyzer.dto.Dto;

@Service
public class Apiserviceimp implements Apiservice{

    @Override
    public Dto callurl(Dto dto) {
       return dto; 
    }
    
}
