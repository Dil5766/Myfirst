package com.example.easynotes.controler;

import com.example.easynotes.entity.Student;
import com.example.easynotes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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


  @RequestMapping("/load/{id}")
	public Optional<Student> getStudent  (@PathVariable String id) {
      return studentService.loadStudentById(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Student addStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return student;
    }

    @RequestMapping(method=RequestMethod.PUT, value="/test/{id}")
     public Student update(  @RequestBody Student students,@PathVariable String id) {
    	return students;
	}

}


