package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.RepositoryCourse;
import com.example.demo.repository.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineCourseApplication {

    @Autowired
    private RepositoryCourse repositoryCourse;
    @Autowired
    private RepositoryStudent repositoryStudent;

    public static void main(String[] args) {
        SpringApplication.run(OnlineCourseApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return args -> {
            Student student1 = new Student("amron");
            Student student2 = new Student("amran");
            Course course1 = new Course("aaa");
            Course course2 = new Course("bbb");
            try {
                repositoryCourse.save(course1);
                repositoryCourse.save(course2);
                repositoryStudent.save(student1);
                repositoryStudent.save(student2);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                for (Student student: repositoryStudent.findAll()) {
                    System.out.println(student.toString());
                }
            }
        };
    }
}