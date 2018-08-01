package com.example.easynotes.teachers.tservice;






import com.example.easynotes.teachers.entity.Teacher;
import com.example.easynotes.teachers.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {


    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Transactional
    @Override
    public Long createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
        return teacher.getId();
    }


    @Transactional
    @Override
    public Optional<Teacher> loadTeacherById(String id)
    {
        return teacherRepository.findById(id);
    }


    @Transactional
    @Override
    public List<Teacher> loadAllTeacher() {
        return teacherRepository.findAll();
    }


    @Transactional
    @Override
    public Boolean removeTeacherByTeacherId(Long teacherId) {
        teacherRepository.deleteById(Long.toString(teacherId));
        return Boolean.TRUE;
    }

}