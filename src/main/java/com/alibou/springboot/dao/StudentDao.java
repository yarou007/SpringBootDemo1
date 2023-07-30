package com.alibou.springboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.alibou.springboot.model.Student;

@Repository
public class StudentDao {

	//haha rit l ghadra ? hedhi reelement el repo ama howa sameha dao hne 
	// eli heya kona naamlou feha l crud w kol directemenet a travers Jpa ;) 
	// it's ok to make ur hands dirty a little bit :p 
	
	
	
	// storage of my student list 
	private final List<Student> STUDENTS = new ArrayList<>();
	
	
	public List<Student> findAllStudent() {
		return STUDENTS;
	}


	public Student save(Student s) {
		STUDENTS.add(s);	
		return s;
	}

	
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return STUDENTS.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null)  ;
	}


	public void deleteStudent(String email) {
 		var student = findByEmail(email);
 		if (student!=null) {
 			STUDENTS.remove(student);
 			}
	}

	
	public Student updateStudent(Student s) {
		var studentIndex = IntStream.range(0, STUDENTS.size())
				.filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail()))
				.findFirst().orElse(-1);
		if (studentIndex>-1) {
			STUDENTS.set(studentIndex, s);
			return s;
		}
		return null;
	}
}
