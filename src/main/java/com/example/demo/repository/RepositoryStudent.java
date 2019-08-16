package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryStudent extends CrudRepository<Student, Long> {
}
