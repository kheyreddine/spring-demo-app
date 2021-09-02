package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "tp", schema = "learning_schema")
@Data
public class TP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "label", nullable = false)
    @NotBlank
    private String label;

    @Future(message = "Date must be in the future")
    private Date deadline;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Student student = new Student();
}
