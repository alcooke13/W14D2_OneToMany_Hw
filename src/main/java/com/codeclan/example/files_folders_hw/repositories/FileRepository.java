package com.codeclan.example.files_folders_hw.repositories;

import com.codeclan.example.files_folders_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
