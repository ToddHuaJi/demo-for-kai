package com.todd.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todd.demo.dao.StudentDao;
import com.todd.demo.models.Student;

@RestController
@RequestMapping("/students")
public class StudnetController {

	@Autowired
	StudentDao std;

	@GetMapping
	public List<Student> getStudents() {
		return std.findAll();
	}

	@PostMapping
	public ResponseEntity<String> addStundent(@RequestBody Student student) {
		std.save(student);
		return new ResponseEntity<String>(student + " is saved!", HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> modifyStudent(@RequestBody Student student) {
		Optional<Student> optStudent = std.findById(student.getId());
		if (optStudent.isPresent()) {
			Student original = optStudent.get();
			original.setAge(student.getAge());
			original.setGrade(student.getGrade());
			original.setName(student.getName());
		} else {
			std.save(student);
		}
		return new ResponseEntity<String>(student + " is modified!", HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		Optional<Student> optStudent = std.findById(id);
		if (optStudent.isPresent()) {
			Student original = optStudent.get();
			std.delete(original);
			return new ResponseEntity<String>(original + " is deleted!", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>( "Student with ID: " + id + " doesn't exist!!", HttpStatus.OK);
		}
	}
}
