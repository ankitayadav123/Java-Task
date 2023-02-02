package com.example.demo.v1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.v1.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
