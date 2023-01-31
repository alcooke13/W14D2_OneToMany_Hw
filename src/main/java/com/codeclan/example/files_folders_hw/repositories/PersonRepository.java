package com.codeclan.example.files_folders_hw.repositories;

import com.codeclan.example.files_folders_hw.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
