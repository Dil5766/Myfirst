package com.example.easynotes.controler;

import com.example.easynotes.entity.Student;
import com.example.easynotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class TestController {

    private final UserRepository userRepository;

    @Autowired
    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Dileep";
    }


  @RequestMapping("/test/{id}")
	public Student getStudent  ( Student student,@PathVariable String id) {
	  return student;

    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Student addStudent(@RequestBody Student student) {
        userRepository.save(student);
        return student;
    }

    @RequestMapping(method=RequestMethod.PUT, value="/test/{id}")
     public Student update(  @RequestBody Student students,@PathVariable String id) {
    	return students;
	}

}


