package com.codespace.codespace.controller;

import com.codespace.codespace.entity.Person;
import com.codespace.codespace.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class CodespaceController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{name}")
    public Person findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    @PostMapping("/person")
    public void save(@RequestBody Person person) {
        personService.save(person);
    }
}
