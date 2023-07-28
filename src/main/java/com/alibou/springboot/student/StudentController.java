package com.alibou.springboot.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibou.springboot.model.Student;
import com.alibou.springboot.services.StudentService;

@RestController 
@RequestMapping("/api/v1/students")
public class StudentController {
    
	/* tight couple instanciation =>
	 * private StudentService studentService = new StudentService(); */
		
	// loosing couple instanciation
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> findAllStudents(){
		return studentService.findAllStudent();
	}
}
