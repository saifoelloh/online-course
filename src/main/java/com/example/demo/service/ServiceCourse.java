package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.RepositoryCourse;
import com.example.demo.service.impl.InterfaceCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCourse implements InterfaceCourse {
    @Autowired private RepositoryCourse repository;

    @Override
    public List<Course> index() {
        return (List<Course>) repository.findAll();
    }

    @Override
    public Optional<Course> show(Long id) {
        return (Optional<Course>) repository.findById(id);
    }

    @Override
    public void store(Course course) {
        try {
            repository.save(course);
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
