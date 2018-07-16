package com.example.easynotes.service;

import com.example.easynotes.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Long createStudent(Student student);

    Optional<Student> loadStudentById(String id);

    List<Student> loadAllStudents();

    Boolean removeStudentByStudentId(Long studentId);
}
