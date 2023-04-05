/**
 * 
 */
package com.example.jpaManytoMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaManytoMany.entity.Student;
import com.example.jpaManytoMany.repo.studentrepository;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student/couse")
public class StudentCourseController {
	
	@Autowired
	private studentrepository studentrepo;
	
	@PostMapping
	public Student saveStudentwithCourse(@RequestBody Student student) {
		return studentrepo.save(student);
	}
	@GetMapping
	public List<Student> findALLStudents(){
		return studentrepo.findAll();
	}
	@GetMapping("/{studentid}")
	public Student findStudent(@PathVariable Long studentid) {
		return studentrepo.findById(studentid).orElse(null);
		
	}
	@GetMapping("/find/{name}")
	public List<Student> findStudentByName(@PathVariable String  name){
		return studentrepo.findByNameContaing(name);
	}
//	@GetMapping("/search/{price}")
//	public List<Course> findCourselessthanprice(@PathVariable double price){
//		return courserepo.findLessthanprice(price);
//		
//	}
}
