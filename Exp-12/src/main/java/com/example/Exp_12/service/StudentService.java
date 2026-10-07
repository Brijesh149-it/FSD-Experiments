package com.example.Exp_12.service;

import com.example.Exp_12.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student findById(int studentId);

    public Student save(Student student);

}