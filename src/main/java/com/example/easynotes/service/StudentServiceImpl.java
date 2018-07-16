package com.example.easynotes.service;

import com.example.easynotes.entity.Student;
import com.example.easynotes.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    @Override
    public Long createStudent(Student student) {
        studentRepository.save(student);
        return student.getId();
    }

    @Transactional
    @Override
    public Optional<Student> loadStudentById(String id) {
        return studentRepository.findById(id);
    }

    @Transactional
    @Override
    public List<Student> loadAllStudents() {
        return studentRepository.findAll();
    }

    @Transactional
    @Override
    public Boolean removeStudentByStudentId(Long studentId) {
        studentRepository.deleteById(Long.toString(studentId));
        return Boolean.TRUE;
    }
}
