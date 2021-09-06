package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.implementations.StudentServiceImpl;
import com.example.demo.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    //Student service
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(Student student) {
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.OK);
    }
}
