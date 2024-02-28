package com.example.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
