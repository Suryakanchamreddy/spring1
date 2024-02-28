package com.example.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.Model.Student;
import com.example.Spring.Service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentService service;
	@PostMapping("studentdetails")
	private int SaveStudent(@RequestBody Student student) {
		
		service.save(student);
		return student.getRollno();
	}

}
