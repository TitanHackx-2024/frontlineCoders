package com.sentimentanalyzer.sentimentanalyzer.service;

import com.sentimentanalyzer.sentimentanalyzer.entity.User;

public interface Userservice {

    User creatUser(User user);

    User UpdateUser(User user,Long id);

    String DeleteUser(Long id);

    User getUser(Long id);
    
}
