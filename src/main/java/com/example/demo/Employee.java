package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="employee")
public class Employee {

   @Id
  // @GeneratedValue
   private int id;

   @NotBlank
   private String name;

    public Employee(){
       super();
    }

    public Employee(int id, String name){
        super();
        this.id =id;
        this.name =name;
    }

    public Integer getId(){
        return id;
    }

    public Integer setId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
