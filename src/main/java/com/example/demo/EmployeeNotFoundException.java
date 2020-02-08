package com.example.demo;

public class EmployeeNotFoundException extends Exception {
    private Integer id;
    public EmployeeNotFoundException(Integer id){
        super(String.format("Employee not found with id  %s", id));
    }
}
