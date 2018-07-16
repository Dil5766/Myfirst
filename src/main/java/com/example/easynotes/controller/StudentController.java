package com.example.easynotes.controller;

import com.example.easynotes.entity.Student;
import com.example.easynotes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Dileep";
    }


    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
	public Optional<Student> getById(@PathVariable String id) {
      return studentService.loadStudentById(id);
    }

    @RequestMapping("/load/all")
    public List<Student> getAll() {
        return studentService.loadAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Long add(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Boolean remove(@PathVariable String id) {
        return studentService.removeStudentByStudentId(Long.valueOf(id));
    }

    @RequestMapping(method=RequestMethod.PUT, value="/test/{id}")
     public Student update(  @RequestBody Student students,@PathVariable String id) {
    	return students;
	}

}


