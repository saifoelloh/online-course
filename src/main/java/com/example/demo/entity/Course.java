package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    public Course(String name) {
        this.name = name;
    }
}
