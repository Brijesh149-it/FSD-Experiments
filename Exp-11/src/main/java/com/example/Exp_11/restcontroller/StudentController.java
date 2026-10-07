package com.example.Exp_11.restcontroller;

import com.example.Exp_11.entity.Student;
import com.example.Exp_11.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return studentService.findById(studentId);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        return studentService.save(student);
    }
}
