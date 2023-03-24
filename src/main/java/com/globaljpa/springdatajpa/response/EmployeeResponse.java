package com.globaljpa.springdatajpa.response;

import com.globaljpa.springdatajpa.entity.Department;
import com.globaljpa.springdatajpa.entity.User;

public class EmployeeResponse {
    private Long id ;

    private String name;
    private Double salary;

    private Department department;

    private User user;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
