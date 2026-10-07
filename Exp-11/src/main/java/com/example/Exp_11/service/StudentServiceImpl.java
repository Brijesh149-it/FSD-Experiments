package com.example.Exp_11.service;

import com.example.Exp_11.entity.Student;
import com.example.Exp_11.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int studentId) {
        Optional<Student> foundStudent = studentRepository.findById(studentId);
        Student student = null;
        if(foundStudent.isPresent()){
            student = foundStudent.get();
        } else {
            try {
                throw new Exception("Student with id "+ studentId+" not found");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return student;
    }

    @Transactional
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }


}
