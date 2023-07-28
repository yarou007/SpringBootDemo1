package com.alibou.springboot.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibou.springboot.model.Student;

@Service
public class StudentService {

	/*
	 * hedhy besh naamaloha aprés ki tabda aana data valid !!
	@Autowired
	private StudentRepository studentRepository;
	*/
	public List<Student> findAllStudent(){
		return List.of(
				new Student("ali","bouali",LocalDate.now(),"contact@gmail.com",55213870),
				new Student("Yassine","Hammi11",LocalDate.now(),"contact@gmail.com",55213870)
				);
	}
}
