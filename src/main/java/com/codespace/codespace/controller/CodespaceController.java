package com.codespace.codespace.controller;

import com.codespace.codespace.entity.Person;
import com.codespace.codespace.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/person")
public class CodespaceController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public Person findByName(String name) {
        return personService.findByName(name);
    }

    @PostMapping
    public void save(@RequestBody Person person) {
        personService.save(person);
    }
}
