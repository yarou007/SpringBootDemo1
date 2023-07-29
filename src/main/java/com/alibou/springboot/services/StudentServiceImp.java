package com.alibou.springboot.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibou.springboot.model.Student;

@Service
public class StudentServiceImp implements StudentService{

	@Override
	public List<Student> findAllStudent() {
		return List.of(
				new Student("Ali","Bouali",LocalDate.now(),"contact@gmail.com",12345678),
				new Student("Ali","Bouali",LocalDate.now(),"contact@gmail.com",12345678)
				);
	}

}
