package com.example.demo.service.impl;

import com.example.demo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface InterfaceStudent {
    List<Student> index();
    Optional<Student> show(Long id);
    void store(Student student);
    void destroy(Long id);
}
