package com.crud.JPALearning.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String email;
    public Person(String name,String email)
    {
        this.name=name;
        this.email=email;
    }

public Person(){
}
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
}