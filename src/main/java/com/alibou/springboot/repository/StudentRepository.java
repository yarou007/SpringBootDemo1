package com.alibou.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alibou.springboot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByEmail(String email);
	
	
}
