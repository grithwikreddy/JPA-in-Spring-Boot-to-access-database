package com.crud.JPALearning.Service;
import java.util.List;
import java.util.Objects;

import com.crud.JPALearning.Entity.Person;
import com.crud.JPALearning.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl
        implements userService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Person savePerson(Person person)
    {
        return userRepo.save(person);
    }

    @Override public List<Person> fetchPersonList()
    {
        return (List<Person>)
                userRepo.findAll();
    }

    @Override
    public Person
    updatePerson(Person user,
                     int userId)
    {
        Person depDB
                = userRepo.findById(userId)
                .get();

        if (Objects.nonNull(user.getName())
                && !"".equalsIgnoreCase(
                user.getName())) {
            depDB.setName(
                    user.getName());
        }

        if (Objects.nonNull(
                user.getEmail())
                && !"".equalsIgnoreCase(
                user.getEmail())) {
            depDB.setEmail(
                    user.getEmail());
        }

        return userRepo.save(depDB);
    }

    @Override
    public void deletePersonById(int userId)
    {
        userRepo.deleteById(userId);
    }
}

