package com.example.SpringAssignment1;

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
        return Arrays.asList("CSC 110F", "CSC 123F");
    }

    @GetMapping("/undergraduate-courses")
    public List<String> getUndergraduateCourses() {
        return Arrays.asList("CSC 211", "CSC 213", "CSC 224", "CSC 313","CSC 312");
    }

    @GetMapping("/honours-courses")
    public List<String> getHonoursCourses() {
        return Arrays.asList("CSC 534", "CSC 511", "CSC 521", "CSC 512");
    }
}
