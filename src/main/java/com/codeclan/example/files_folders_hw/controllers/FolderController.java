package com.codeclan.example.files_folders_hw.controllers;

import com.codeclan.example.files_folders_hw.models.Folder;
import com.codeclan.example.files_folders_hw.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "folders")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder newFolder){
        folderRepository.save(newFolder);
        return new ResponseEntity<>(newFolder, HttpStatus.CREATED);
    }

}
