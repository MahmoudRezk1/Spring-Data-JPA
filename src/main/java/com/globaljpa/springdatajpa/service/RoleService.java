package com.globaljpa.springdatajpa.service;

import com.globaljpa.springdatajpa.entity.Role;
import com.globaljpa.springdatajpa.entity.User;
import com.globaljpa.springdatajpa.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;
    public List<Role> findAll(){
        return roleRepo.findAll();
    }

    public Role findById(Long id){
        return roleRepo.findById(id).orElseThrow();
    }
    public Role insert(Role role){
        return roleRepo.save(role);
    }
    public Role update(Role role){
        Role current =roleRepo.findById(role.getId()).get();
        current.setName(role.getName());
        return roleRepo.save(current);
    }
}

