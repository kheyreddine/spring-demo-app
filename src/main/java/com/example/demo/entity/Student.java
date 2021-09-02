package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student", schema = "learning_schema")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "student_name", length = 50, nullable = false)
    @NotBlank(message = "This field cannot be empty")
    private String studentName;

    @Email
    private String email;

    @OneToMany(mappedBy = "student", targetEntity = TP.class)
    private Set<TP> tp;

    @ManyToMany
    @JoinTable(schema = "learning_schema", name = "courses_students", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses = new ArrayList<>();
}
