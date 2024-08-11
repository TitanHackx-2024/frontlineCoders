package com.sentimentanalyzer.sentimentanalyzer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sentimentanalyzer.sentimentanalyzer.dto.GoogleApi;
import com.sentimentanalyzer.sentimentanalyzer.dto.GoogleResponse;
import com.sentimentanalyzer.sentimentanalyzer.dto.Postsetment;
import com.sentimentanalyzer.sentimentanalyzer.dto.Postsetmentrequest;
import com.sentimentanalyzer.sentimentanalyzer.service.Apiservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Apicontroller {

    @Autowired
    Apiservice apiservice;
   
    @PostMapping("/getpostsentiment")
    public Postsetment postSentiment(@RequestBody Postsetmentrequest postsetmentrequest) {

        GoogleApi api = new GoogleApi();
        api.setUrl(null);
        GoogleResponse googleResponse =(GoogleResponse) apiservice.callurl(api);
        return new Postsetment();
        
    }
    
}
