package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.implementations.CourseServiceImpl;
import com.example.demo.service.interfaces.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(path = "courses")
    public ResponseEntity<List<Course>> getCourses() {
        List<Course> courses = courseService.getCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
