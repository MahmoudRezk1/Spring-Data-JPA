package com.globaljpa.springdatajpa.controller;

import com.globaljpa.springdatajpa.entity.Employee;
import com.globaljpa.springdatajpa.response.EmployeeResponse;
import com.globaljpa.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(path = "/findAll")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping(path = "/findById")
    public EmployeeResponse findById(@RequestParam Long id){
        return employeeService.findById(id);
    }
    @PostMapping(path = "/insertEmployee")
    public Long insert(@RequestBody Employee emp){
        return employeeService.insert(emp);
    }
    @PutMapping(path = "/updateEmployee")
    public Employee update(@RequestBody Employee emp){
        return employeeService.update(emp);
    }
    @GetMapping(path = "/findByDepartmentId")
    List<Employee> findByDepartmentId(@RequestParam Long id){
        return employeeService.findByDepartmentId(id);
    }
    @GetMapping(path = "/count-by-name-department")
    public Long findByNameAndDepartment(@RequestParam String empName,@RequestParam String depName){
        return employeeService.findByNameAndDepartment(empName,depName);
    }
    @GetMapping(path = "/findBySalary")
    public List<Employee> findBySalary(Double salary){
        return employeeService.findBySalary(salary);
    }
}

