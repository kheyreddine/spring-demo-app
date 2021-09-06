package com.example.demo.entity;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "course", schema = "learning_schema")
@Data
public  class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "course_name", nullable = false)
    @NotBlank(message = "This field cannot be blank")
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    List<Student> students = new ArrayList<>();
}
