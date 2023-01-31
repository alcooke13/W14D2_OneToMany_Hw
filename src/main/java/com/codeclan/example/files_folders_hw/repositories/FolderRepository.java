package com.codeclan.example.files_folders_hw.repositories;

import com.codeclan.example.files_folders_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
