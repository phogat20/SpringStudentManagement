package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepo;
import com.serivce.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student addStudentDetail(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public Student getStudentDetail(Integer id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudentDetail(Student s,Integer id) {
		Student existingStudent = studentRepo.findById(s.getAdmissionId()).orElse(null);
		existingStudent.setFirstName(s.getFirstName());
		existingStudent.setLastName(s.getLastName());
		existingStudent.setGender(s.getGender());
		existingStudent.setParentName(s.getParentName());
		existingStudent.setRollNo(s.getRollNo());
		return studentRepo.save(existingStudent);
	}

	@Override
	public void deleteStudentDetail(Integer id) {
		studentRepo.deleteById(id);

	}

	@Override
	public List<Student> getAllStudentDetails() {
		return studentRepo.findAll();
	}
}
