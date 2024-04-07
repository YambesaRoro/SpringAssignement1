package com.example.spring_assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@SpringBootApplication
@RestController

public class SpringAssignment1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringAssignment1Application.class, args);
    }

    @GetMapping("/foundation-courses")
    public List<String> getFoundationCourses() {
        return Arrays.asList("CSC 112F", "CSC 121F");
    }

    @GetMapping("/undergraduate-courses")
    public List<String> getUndergraduateCourses() {
        return Arrays.asList("CSC 223", "CSC 213");
    }

    @GetMapping("/honors-courses")
    public List<String> getHonorsCourses() {
        return Arrays.asList("CSC 521", "CSC 514", "CSC 521", "CSC 523");
    }
}
