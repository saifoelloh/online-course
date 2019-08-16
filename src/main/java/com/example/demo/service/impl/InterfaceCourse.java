package com.example.demo.service.impl;

import com.example.demo.entity.Course;

import java.util.List;
import java.util.Optional;

public interface InterfaceCourse {
    List<Course> index();
    Optional<Course> show(Long id);
    void store(Course course);
    void destroy(Long id);
}
