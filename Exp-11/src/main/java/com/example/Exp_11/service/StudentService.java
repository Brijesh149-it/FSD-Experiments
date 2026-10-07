package com.example.Exp_11.service;

import com.example.Exp_11.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student findById(int studentId);
    public Student save(Student student);
}
