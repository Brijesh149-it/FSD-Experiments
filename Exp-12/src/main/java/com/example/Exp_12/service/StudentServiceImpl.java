package com.example.Exp_12.service;

import com.example.Exp_12.entity.Student;
import com.example.Exp_12.exception.StudentNotFoundException;
import com.example.Exp_12.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int studentId) {
        Optional<Student> foundStudent = studentRepository.findById(studentId);

        Student student = null;

        if(foundStudent.isPresent()) {
            student = foundStudent.get();
        } else {
            throw new StudentNotFoundException("Student with id " + studentId + " not found");
        }
        return student;
    }

    @Transactional
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}