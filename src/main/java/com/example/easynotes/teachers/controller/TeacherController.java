package com.example.easynotes.teachers.controller;



import com.example.easynotes.teachers.entity.Teacher;
import com.example.easynotes.teachers.tservice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {



    private TeacherService teacherService;

    @Autowired
    public TeacherController (TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return "Dileep";
    }


    @RequestMapping(value = "/loads/{id}", method = RequestMethod.GET)
    public Optional<Teacher> getById(@PathVariable String id) {
        return teacherService.loadTeacherById(id);
    }

    @RequestMapping("/load/teacher")
    public List<Teacher> getAll() {
        return teacherService.loadAllTeacher();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addt")
    public Long addt(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

    @RequestMapping(method = RequestMethod.DELETE ,value ="/delete")
    public Boolean remove(@PathVariable String id) {
        return teacherService.removeTeacherByTeacherId(Long.valueOf(id));
    }

    @RequestMapping(method=RequestMethod.PUT, value="/test1/{id}")
    public Teacher update(  @RequestBody Teacher teachers,@PathVariable String id) {
        return teachers;
    }

}
