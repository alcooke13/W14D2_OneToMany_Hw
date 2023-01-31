package com.codeclan.example.files_folders_hw.controllers;

import com.codeclan.example.files_folders_hw.models.File;
import com.codeclan.example.files_folders_hw.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<File> postFile(@RequestBody File newFile){
        fileRepository.save(newFile);
        return new ResponseEntity<>(newFile, HttpStatus.CREATED);
    }
}
