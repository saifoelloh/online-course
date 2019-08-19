package com.example.demo.repository;

import com.example.demo.entity.CourseStudent;
import com.example.demo.entity.CourseStudentKey;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCourseStudent extends CrudRepository<CourseStudent, CourseStudentKey> {
}
