package com.example.Exp_11.repository;

import com.example.Exp_11.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}