package com.example.Student.repository;


import com.example.Student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {

    @Query("from Student s where s.lastname like %:lastname%")
    Set<Student> getStudentByLastNameLike(@Param("lastname")String lastname);

}
