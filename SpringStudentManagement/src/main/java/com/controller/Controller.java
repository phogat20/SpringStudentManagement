package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.serivce.StudentService;

@RestController
public class Controller {

	@Autowired
	private StudentService studentService;

	@PostMapping("/addStudent")
	public Student addCStudentDetials(@RequestBody Student s) {
		return studentService.addStudentDetail(s);
	}

	@GetMapping("/getStudentDetail/{id}")
	public Student getCStudentDetail(@PathVariable Integer id) {
		return studentService.getStudentDetail(id);
	}

	@GetMapping("/getAllCStudentDetails")
	public List<Student> getCAllStudentDetails() {
		return studentService.getAllStudentDetails();
	}

	@PutMapping("/updateStudentDetail/{id}")
	public Student updateStudent(@PathVariable Integer id, @RequestBody Student s) {
		return studentService.updateStudentDetail(s, id);

	}

	@DeleteMapping("/deleteStudentDetail/{id}")
	public String deleteStudentDetail(@PathVariable Integer id) {
		studentService.deleteStudentDetail(id);
		return "Record Deleted!";
	}
}
