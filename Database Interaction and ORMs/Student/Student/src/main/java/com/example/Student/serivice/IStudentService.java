package com.example.Student.serivice;

import com.example.Student.model.StudentDTO;

import java.util.Collection;
import java.util.Set;

public interface IStudentService {
    public void createStudent(StudentDTO stu);

    public StudentDTO readStudent(Long id);

    public void updateStudent(StudentDTO studentDTO);

    public void deleteStudent(Long id);

    public Collection<StudentDTO> getAll();

    public Set<StudentDTO> getStudentWithLastNameLike(String lastname);
}
