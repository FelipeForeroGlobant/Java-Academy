package com.example.Student.controller;

import com.example.Student.model.StudentDTO;
import com.example.Student.serivice.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Set;

public class StudentController {

    @Autowired
    IStudentService studentService;


    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody StudentDTO studentDTO)
    {
        studentService.createStudent(studentDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable long id)
    {
        return studentService.readStudent(id);
    }

    @PutMapping()
    public ResponseEntity<?> updateStudent(@RequestBody StudentDTO studentDTO)
    {
        studentService.updateStudent(studentDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable long id)
    {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.OK).body("eliminado");

    }

    @GetMapping("/list")
    public Collection<StudentDTO> listStudents()
    {
        return studentService.getAll();
    }

    @GetMapping("/listlastname")
    public Set<StudentDTO> listStudents(@RequestParam String lastname)
    {
        return studentService.getStudentWithLastNameLike(lastname);
    }


}
