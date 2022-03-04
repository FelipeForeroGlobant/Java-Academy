package com.example.Student.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CourseDTO {
    private Long id;
    private Student student;
    private int note;
}
