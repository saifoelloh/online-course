package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class CourseStudentKey implements Serializable {
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "student_id")
    private Long studentId;
}
