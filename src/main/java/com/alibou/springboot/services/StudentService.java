package com.alibou.springboot.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibou.springboot.model.Student;

public interface StudentService {

	/*
	 * hedhy besh naamaloha aprés ki tabda aana data valid !!
	@Autowired
	private StudentRepository studentRepository;
	*/
	 List<Student> findAllStudent();
}
