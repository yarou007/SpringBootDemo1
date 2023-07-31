package com.alibou.springboot.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.alibou.springboot.model.Student;
import com.alibou.springboot.repository.StudentRepository;

@Service
@Primary
public class DBStudentService implements StudentService {

	
	private final StudentRepository studentRepository;
	
	public DBStudentService(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	
	
	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return studentRepository.findByEmail(email);
	}

	@Override
	public void deleteStudent(String email) {
		//studentRepository.deleteByEmail(email);		
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
