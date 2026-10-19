package com.example.SpringBootCRUDDemo.repository;

import com.example.SpringBootCRUDDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq){
        //save to db
        System.out.println("Inside student service");
        return null;
    }
}
