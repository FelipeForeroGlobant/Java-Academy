package com.example.Student.serivice;

import com.example.Student.model.CourseDTO;

import java.util.Collection;

public interface ICourseService {

    public void createCourse(CourseDTO courseDTO);

    public Collection<CourseDTO> getAll();
}
