package com.example.easynotes.controler;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@Column(name = "id", nullable = false)
	private String id;
	
	@Column(name = "lname", nullable = false)
	private String lname;
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@Column(name = "school", nullable = false)
	private String school;
	
	

	public Student() {
		
}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}
	
}
