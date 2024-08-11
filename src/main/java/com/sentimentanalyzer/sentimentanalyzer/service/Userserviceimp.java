package com.sentimentanalyzer.sentimentanalyzer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sentimentanalyzer.sentimentanalyzer.entity.User;
import com.sentimentanalyzer.sentimentanalyzer.repository.Userrepository;

public class Userserviceimp implements Userservice{

    @Autowired
    Userrepository userrepository;

    

    @Override
    public User creatUser(User user) {

        User new_user = userrepository.save(user);
        return new_user;
    }

    @Override
    public User UpdateUser(User user, Long id) {
        Optional<User> optional_user =userrepository.findById(id);
        User old_user =optional_user.get();
        old_user.setEmail(user.getEmail());
        old_user.setName(user.getName());
        old_user.setName(user.getName());
        return userrepository.save(old_user);
        
    }

    @Override
    public String DeleteUser(Long id) {
      userrepository.deleteById(id); 
      return "Delete sucessfull";
    }

    @Override
    public User getUser(Long id) {
        Optional<User> optional_user =userrepository.findById(id);
        User old_user =optional_user.get();
        return old_user;
    }
    
}
