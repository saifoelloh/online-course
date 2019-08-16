package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.RepositoryStudent;
import com.example.demo.service.impl.InterfaceStudent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceStudent implements InterfaceStudent {
    @Autowired private RepositoryStudent repository;

    @Override
    public List<Student> index() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Optional<Student> show(Long id) {
        return (Optional<Student>) repository.findById(id);
    }

    @Override
    public void store(Student student) {
        try {
            repository.save(student);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void destroy(Long id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
