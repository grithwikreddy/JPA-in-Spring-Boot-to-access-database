package com.crud.JPALearning.Service;

// Importing required classes


import com.crud.JPALearning.Entity.Person;

import java.util.List;

// Interface
public interface userService {

    // Save operation
    Person savePerson(Person user);

    // Read operation
    List<Person> fetchPersonList();

    // Update operation
    Person updatePerson(Person user,
                                int userId);

    // Delete operation
    void deletePersonById(int userId);
}
