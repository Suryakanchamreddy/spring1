package com.example.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.Model.Student;
import com.example.Spring.Repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	
	public void save(Student student) {
		
		repo.save(student);
		
		
		
	}

}
