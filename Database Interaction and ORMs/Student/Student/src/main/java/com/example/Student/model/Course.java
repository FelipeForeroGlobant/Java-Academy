package com.example.Student.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
@Getter @Setter

public class Course {

    private Long id;
    private int note;

    @ManyToOne
    @JoinColumn(name="Student_id", nullable = false)
    private Student student;


}
