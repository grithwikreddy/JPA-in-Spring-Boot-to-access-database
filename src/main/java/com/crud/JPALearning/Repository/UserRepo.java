package com.crud.JPALearning.Repository;

import com.crud.JPALearning.Entity.Person;
//import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<Person,Integer> {
}