package com.globaljpa.springdatajpa.service;

import com.globaljpa.springdatajpa.entity.Department;
import com.globaljpa.springdatajpa.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public List<Department> findAll(){
        return departmentRepo.findAll();
    }

    public Department findById(Long id){
        return departmentRepo.findById(id).orElseThrow();
    }
    public Department insert(Department dept){
        return departmentRepo.save(dept);
    }
    public Department update(Department dept){
        Department current =departmentRepo.findById(dept.getId()).get();
        current.setName(dept.getName());
        return departmentRepo.save(current);
    }
}
