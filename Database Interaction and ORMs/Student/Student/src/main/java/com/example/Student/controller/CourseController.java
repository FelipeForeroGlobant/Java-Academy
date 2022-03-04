package com.example.Student.controller;


import com.example.Student.model.CourseDTO;
import com.example.Student.serivice.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    ICourseService courseService;

    @PostMapping
    public ResponseEntity<?> addCourse(@RequestBody CourseDTO courseDTO)
    {
        courseService.createCourse(courseDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public Collection<CourseDTO> listCourses()
    {
        return courseService.getAll();
    }
}


