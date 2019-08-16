package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CourseStudent {
    @EmbeddedId
    CourseStudentKey id;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @MapsId("course_id")
    @JoinColumn(name = "course_id")
    private Course course;

    private int rate;
}
