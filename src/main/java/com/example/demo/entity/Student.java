package com.example.demo.entity;

import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    @CreationTimestamp
    private LocalDateTime created_at;

    public Student(String name) {
        this.name = name;
    }
}
