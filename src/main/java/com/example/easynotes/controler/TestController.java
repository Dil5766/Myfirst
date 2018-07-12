package com.example.easynotes.controler;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/test")
	public ResponseEntity<?> test() {
	
		
		return new ResponseEntity<>("dileep",HttpStatus.OK);
			
	}
//  @RequestMapping("/test/{id}")
//	public Student getstudent  ( Student student,@PathVariable String id) {
	 
//	  return student;
		
	//}
  
   @Transactional
	@RequestMapping(method=RequestMethod.POST, value ="/test")
	public Student  addstudent( @RequestBody Student student){
	   System.out.println("dileep");
		userRepository.save(student);
		return student;
//		return ResponseEntity.status(HttpStatus.OK).build();
	}
	//@RequestMapping(method=RequestMethod.PUT, value="/test/{id}")
	 // public Student update(  @RequestBody Student students,@PathVariable String id) {
	
	//	return students;
//	}
			
		}
	

