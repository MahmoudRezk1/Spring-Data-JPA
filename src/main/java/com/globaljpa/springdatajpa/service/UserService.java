package com.globaljpa.springdatajpa.service;

import com.globaljpa.springdatajpa.entity.User;
import com.globaljpa.springdatajpa.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User findById(Long id){
        return userRepo.findById(id).orElseThrow();
    }
    public User insert(User user){
        return userRepo.save(user);
    }
    public User update(User user){
        User current =userRepo.findById(user.getId()).get();
        current.setUserName(user.getUserName());
        return userRepo.save(current);
    }
}
