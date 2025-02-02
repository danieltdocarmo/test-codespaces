package com.codespace.codespace.repository;

import com.codespace.codespace.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person) {
        entityManager.persist(person);
    }

    public Person findByName(String name) {
        return entityManager.find(Person.class, name);
    }
}
