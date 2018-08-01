package com.example.easynotes.teachers.repository;



import com.example.easynotes.teachers.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface TeacherRepository  extends JpaRepository<Teacher, String> {
}
