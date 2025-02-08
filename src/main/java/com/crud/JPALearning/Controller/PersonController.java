package com.crud.JPALearning.Controller;
// Java Program to Illustrate DepartmentController File

import java.util.List;
//import javax.validation.Valid;
// Importing required classes
import com.crud.JPALearning.Entity.Person;
import com.crud.JPALearning.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private userService userservice;

//    @PostMapping("/insert")
//    public Person savePerson( //@Valid
//             @RequestParam String name, @RequestParam String email)
//    {
//        Person newPerson=new Person(name,email);
//        return userservice.savePerson(newPerson);
//    }
@PostMapping("/insert")
public Person savePerson( @RequestBody Person person)
{
    return userservice.savePerson(person);
}

    @GetMapping("/readAll")
    public List<Person> fetchPersonList()
    {
        return userservice.fetchPersonList();
    }

    @PutMapping("/update/{id}")
    public Person updatePerson(@RequestBody Person person,@PathVariable("id") int id)
    {
        return userservice.updatePerson(person, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePersonById(@PathVariable("id") int personId)
    {
        userservice.deletePersonById(
                personId);
        return "Deleted Successfully";
    }
}
