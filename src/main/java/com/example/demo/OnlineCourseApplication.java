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

import java.util.Scanner;

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
            int limit = 0;
            int stat = 0;
            Student student = new Student();
            Scanner input = new Scanner(System.in);

            System.out.print("Input student\t: ");
            stat = Integer.parseInt(input.nextLine());
            if (stat==1) {
                System.out.println("\nStudent");
                System.out.println("-------------------------------");
                System.out.print("name\t: ");
                student.setName(input.nextLine());
            }

            System.out.print("\nTotal course\t: ");
            limit = Integer.parseInt(input.nextLine());
            System.out.println("Course");
            System.out.println("-------------------------------");
            for (int i = 0; i < limit; i++) {
                Course course = new Course();
                System.out.print("name\t: ");
                course.setName(input.nextLine());
                repositoryCourse.save(course);
                System.out.println();
            }
        };
    }
}
