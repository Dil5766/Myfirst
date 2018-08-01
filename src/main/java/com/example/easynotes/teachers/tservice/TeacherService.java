package com.example.easynotes.teachers.tservice;


import com.example.easynotes.teachers.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    Long createTeacher(Teacher teacher);

    Optional<Teacher> loadTeacherById(String id);

    List<Teacher> loadAllTeacher();

    Boolean removeTeacherByTeacherId(Long teacherId);
}