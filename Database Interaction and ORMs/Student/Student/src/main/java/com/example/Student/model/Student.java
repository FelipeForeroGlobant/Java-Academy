package com.example.Student.model;

import com.example.Student.model.Course;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Student")
@Getter @Setter

public class Student {

    @Id
    @GeneratedValue

    private Long Id;
    private String name;
    private String LastName;

    @OneToMany(mappedBy = "student")
    @JsonIgnore
    private Set<Course> courses;
}
