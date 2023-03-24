package com.globaljpa.springdatajpa.config;

import com.globaljpa.springdatajpa.entity.Role;
import com.globaljpa.springdatajpa.entity.User;
import com.globaljpa.springdatajpa.service.RoleService;
import com.globaljpa.springdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class AppStartUp implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Override
    public void run(String... args) throws Exception {
        if (userService.findAll().isEmpty()) {
//        create new roles and insert it
            Role role1 = new Role();
            role1.setName("Admin");

            Role role2 = new Role();
            role2.setName("User");

            roleService.insert(role1);
            roleService.insert(role2);

//        create new users and insert it

            User user1 = new User();
            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(role1);
            user1.setUserName("Admin");
            user1.setPassword("123");
            user1.setRoles(adminRoles);
            userService.insert(user1);

            User user2 = new User();
            Set<Role> userRoles = new HashSet<>();
            userRoles.add(role2);
            user2.setUserName("User");
            user2.setPassword("123");
            user2.setRoles(userRoles);
            userService.insert(user2);

        }
    }
}
