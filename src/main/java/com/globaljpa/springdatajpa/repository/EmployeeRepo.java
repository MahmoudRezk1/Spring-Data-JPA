package com.globaljpa.springdatajpa.repository;

import com.globaljpa.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    List<Employee> findByDepartmentId(Long id);
    Long countByNameContainingAndDepartmentNameContaining (String empName,String depName);
    List<Employee> findBySalary (Double salary);
}
