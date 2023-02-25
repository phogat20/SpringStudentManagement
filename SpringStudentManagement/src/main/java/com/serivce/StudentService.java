package com.serivce;


import java.util.List;

import com.model.Student;

public interface StudentService {

	Student addStudentDetail(Student s);
	
	Student getStudentDetail(Integer id);
	
	List<Student> getAllStudentDetails();

	void deleteStudentDetail(Integer id);

	Student updateStudentDetail(Student s, Integer id);

}
