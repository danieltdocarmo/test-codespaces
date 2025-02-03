package com.codespace.codespace.repository;

import com.codespace.codespace.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends JpaRepository<Person, Integer> {

    Person findByName(String name);
}
