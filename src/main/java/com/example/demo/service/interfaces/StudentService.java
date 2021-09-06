package com.example.demo.service.interfaces;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student addStudent(Student student);
}
