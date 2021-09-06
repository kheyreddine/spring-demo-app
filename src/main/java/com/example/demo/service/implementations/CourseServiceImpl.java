package com.example.demo.service.implementations;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getCourses() {
        return courseRepository.getCourses();
    }
}
