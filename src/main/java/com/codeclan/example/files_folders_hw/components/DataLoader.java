package com.codeclan.example.files_folders_hw.components;


import com.codeclan.example.files_folders_hw.models.File;
import com.codeclan.example.files_folders_hw.models.Folder;
import com.codeclan.example.files_folders_hw.models.Person;
import com.codeclan.example.files_folders_hw.repositories.FileRepository;
import com.codeclan.example.files_folders_hw.repositories.FolderRepository;
import com.codeclan.example.files_folders_hw.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

   public DataLoader(){

   }


    public void run(ApplicationArguments args){

       Person henry = new Person("Henry");
       personRepository.save(henry);

       Person jeff = new Person("Jeff");
       personRepository.save(jeff);

       Person janet = new Person("Janet");
       personRepository.save(janet);


       Folder homework = new Folder("Homework", jeff);
       folderRepository.save(homework);

       Folder memes = new Folder("Memes", jeff);
       folderRepository.save(memes);

       Folder pictures = new Folder("Pictures", henry);
       folderRepository.save(pictures);

       Folder work = new Folder("Work", janet);
       folderRepository.save(work);


       File engHw = new File("English Hw", ".word", 2, homework);
       fileRepository.save(engHw);

       File meme1 = new File("LMAO", ".gif", 5, memes);
       fileRepository.save(meme1);

       File meme2 = new File("Bruh", ".png", 3, memes);
       fileRepository.save(meme2);

       File picture = new File("Holiday", "JPEG", 10, pictures);
       fileRepository.save(picture);

       File work1 = new File("Work", ".ppt", 7, work);
       fileRepository.save(work1);

    }
}
