package com.alibou.springboot.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibou.springboot.model.Student;
import com.alibou.springboot.repository.StudentRepository;
import com.alibou.springboot.services.StudentService;

@RestController 
@RequestMapping("/api/v1/students")
public class StudentController {
    
	/* tight couple instanciation =>
	 * private StudentService studentService = new StudentService(); */
		
	// loosing couple instanciation ( il ya plusieurs methode btw ) 
	
	
	// @Autowired 
	// private StudentService studentService; içi nestaamlou fil InMemory data   != lokhra DB data 
	@Autowired
	private StudentRepository studentRepository;
	/*
	 * Ye testaamel methode hedhi w lekher yetnaha jemla , ye testaamel priamry , ye testaamel @Qualifier("esm el service") fil constructeur => sans utlisation
	 * de @Autowired 
	 */
	
	@PostMapping
	public Student StudentSave(@RequestBody Student s) { // avec RequestBody => spring will map ( serialize ) the object as json 	
		return studentRepository.save(s);
	}
	
	@GetMapping("/{email}")
	public Student findByEmail(@PathVariable("email") String email) { // avec @PathVariable = on lie el email bel variabel li fil http request
		return studentRepository.findByEmail(email);
	}
	
	@GetMapping
	public List<Student> findAllStudents(){
		return studentRepository.findAll();
	}
	
	
	@PutMapping
	public Student updateStudent(@RequestBody Student s) {
		return studentRepository.save(s);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id")  Integer id) {
		studentRepository.deleteById(id);
	}
}
