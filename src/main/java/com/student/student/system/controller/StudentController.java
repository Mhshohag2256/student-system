package com.student.student.system.controller;

import com.student.student.system.model.Student;
import com.student.student.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }

    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
}
