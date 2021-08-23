package com.one.digitalinnovation.personapi.controller;

import com.one.digitalinnovation.personapi.dto.MessageResponseDTO;
import com.one.digitalinnovation.personapi.entity.Person;
import com.one.digitalinnovation.personapi.repository.PersonRepository;
import com.one.digitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createperson(@RequestBody Person person){
        return personService.createPerson(person);
    }

}
