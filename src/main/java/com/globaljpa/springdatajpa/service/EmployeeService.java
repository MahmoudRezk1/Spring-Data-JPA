package com.globaljpa.springdatajpa.service;

import com.globaljpa.springdatajpa.entity.Employee;
import com.globaljpa.springdatajpa.repository.EmployeeRepo;
import com.globaljpa.springdatajpa.response.EmployeeResponse;
import jakarta.persistence.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentService departmentService;
    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }
    public EmployeeResponse findById(Long id){
                Employee emp =employeeRepo.findById(id).orElseThrow();
                EmployeeResponse current = new EmployeeResponse();
                current.setId(emp.getId());
                current.setName(emp.getName());
                current.setDepartment(emp.getDepartment());
                current.setUser(emp.getUser());
        return current;
    }
    public Long insert(Employee emp){
        if (emp.getDepartment() != null && emp.getDepartment().getId() != null){
            emp.setDepartment(departmentService.findById(emp.getDepartment().getId()));
        }

               Employee employee = employeeRepo.save(emp);
        return employee.getId();
    }
    public Employee update(Employee emp){
        Employee current =employeeRepo.findById(emp.getId()).get();
        current.setName(emp.getName());
        current.setSalary(emp.getSalary());
        current.setDepartment(emp.getDepartment());
        return employeeRepo.save(current);
    }
    public List<Employee> findByDepartmentId(Long id){
        return employeeRepo.findByDepartmentId(id);
    }
    public Long findByNameAndDepartment(String empName,String depName){
        return employeeRepo.countByNameContainingAndDepartmentNameContaining(empName,depName);
    }
    public List<Employee> findBySalary(Double salary){
        return employeeRepo.findBySalary(salary);
    }
}
