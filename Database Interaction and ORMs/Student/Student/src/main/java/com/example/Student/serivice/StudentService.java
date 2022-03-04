package com.example.Student.serivice;

import com.example.Student.model.Student;
import com.example.Student.model.StudentDTO;
import com.example.Student.repository.IStudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class StudentService implements IStudentService{

    @Autowired
    IStudentRepository studentRepository;

    @Autowired
    ObjectMapper mapper;

    public void createStudent(StudentDTO stu) {
        Student student = mapper.convertValue(stu, Student.class);
        studentRepository.save(student);
    }

    public StudentDTO readStudent(Long id) {
        StudentDTO studentDTO = null;
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentDTO = mapper.convertValue(student, StudentDTO.class);
        }
        return studentDTO;
    }

    public void updateStudent(StudentDTO studentDTO) {
        Student student = mapper.convertValue(studentDTO, Student.class);
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Collection<StudentDTO> getAll() {
        List<Student> students = studentRepository.findAll();
        Set<StudentDTO> studentsDTO = new HashSet<>();
        for (Student student : students) {
            StudentDTO studentDTO = new StudentDTO();


            studentDTO.setName(student.getName());
            studentDTO.setLastName(student.getLastName());
            studentDTO.setId(student.getId());

            studentsDTO.add(studentDTO);
        }
        return studentsDTO;
    }

    public Set<StudentDTO> getStudentWithLastNameLike(String lastname) {

        Set<Student> students = studentRepository.getStudentByLastNameLike(lastname);

        Set<StudentDTO> studentsDTO = new HashSet<>();
        for (Student student : students) {
            StudentDTO studentDTO = new StudentDTO();

            studentDTO.setName(student.getName());
            studentDTO.setLastName(student.getLastName());
            studentDTO.setId(student.getId());

            studentsDTO.add(studentDTO);
        }
        return studentsDTO;
    }
}