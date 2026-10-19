package com.example.SpringBootCRUDDemo.controller;

import com.example.SpringBootCRUDDemo.entity.Student;
import com.example.SpringBootCRUDDemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private StudentService studentService;
    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        Student createdStudent = studentService.createStudent(student);
    }



}
