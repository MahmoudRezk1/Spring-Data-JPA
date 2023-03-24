package com.globaljpa.springdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="dep_generator")
//    @SequenceGenerator(name = "dep_generator",sequenceName = "department_gen",allocationSize = 1,initialValue = 100)

//    @GeneratedValue(strategy = GenerationType.TABLE,generator = "dept_gen")
//    @TableGenerator(name = "dept_gen",table = "department_gen",allocationSize = 1,initialValue = 100)
    @Column(name = "dep_id")
    private Long id;
    @Column(name = "dep_name")
    private String name;

//    @OneToMany(mappedBy = "department",fetch = FetchType.EAGER)
////    @JsonIgnore
//    private List<Employee> employees;
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

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
}
