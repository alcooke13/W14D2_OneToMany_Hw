package com.codeclan.example.files_folders_hw.controllers;

import com.codeclan.example.files_folders_hw.models.Person;
import com.codeclan.example.files_folders_hw.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;


    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> postPerson(@RequestBody Person newPerson){
        personRepository.save(newPerson);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

}
