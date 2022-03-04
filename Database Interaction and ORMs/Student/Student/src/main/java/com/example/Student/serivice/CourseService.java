package com.example.Student.serivice;

import com.example.Student.model.Course;
import com.example.Student.model.CourseDTO;
import com.example.Student.repository.ICourseRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CourseService implements ICourseService{

    @Autowired
    ICourseRepository courseRepositoryRepository;

    @Autowired
    ObjectMapper mapper;

    public void createCourse(CourseDTO courseDTO)
    {
        Course course = mapper.convertValue(courseDTO, Course.class);
        courseRepositoryRepository.save(course);
    }

    public Collection<CourseDTO> getAll()
    {
        List<Course> courses = courseRepositoryRepository.findAll();

        Set<CourseDTO> coursesDTO = new HashSet<>();
        for(Course course : courses){
            coursesDTO.add(mapper.convertValue(course,CourseDTO.class));

        }
        return coursesDTO;
    }
}
