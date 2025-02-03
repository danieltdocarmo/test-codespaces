package com.codespace.codespace.service;

import com.codespace.codespace.entity.Person;
import com.codespace.codespace.repository.PersonDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    public Person findByName(String name){
        return personDAO.findByName(name);
    }

    @Transactional
    public void save(Person person){
        personDAO.save(person);
    }
}
