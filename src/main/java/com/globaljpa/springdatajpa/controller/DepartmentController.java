package com.globaljpa.springdatajpa.controller;

import com.globaljpa.springdatajpa.entity.Department;
import com.globaljpa.springdatajpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping(path = "/findAll")
    public List<Department> findAll(){
        return departmentService.findAll();
    }
    @GetMapping(path = "/findById")
    public Department findById(Long id){
        return departmentService.findById(id);
    }
    @PostMapping(path = "/insertDepartment")
    public Department insert(@RequestBody Department dept){
        return departmentService.insert(dept);
    }
    @PutMapping(path = "/updateDepartment")
    public Department update(@RequestBody Department dept){
        return departmentService.update(dept);
    }

}

