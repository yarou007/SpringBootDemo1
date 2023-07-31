package com.alibou.springboot.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibou.springboot.dao.StudentDao;
import com.alibou.springboot.model.Student;

@Service
public class StudentServiceImp implements StudentService{

	
	private final StudentDao studentDao;
	
	public StudentServiceImp(StudentDao studentDao) {
		
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAllStudent() {
		return this.studentDao.findAllStudent();
	}

	@Override
	public Student save(Student s) {
		return this.studentDao.save(s);
		
	}

	@Override
	public Student findByEmail(String email) {
		return this.studentDao.findByEmail(email);
	}

	@Override
	public void deleteStudent(String email) {
        this.studentDao.deleteStudent(email);		
	}

	@Override
	public Student updateStudent(Student s) {
		return this.studentDao.updateStudent(s);
	}

}
