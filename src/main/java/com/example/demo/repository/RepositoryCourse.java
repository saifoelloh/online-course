package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCourse extends CrudRepository<Course, Long> {
}
