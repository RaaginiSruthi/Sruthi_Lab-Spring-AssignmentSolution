package com.gl.studentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.studentManagement.entity.Student;
import com.gl.studentManagement.repository.StudentDAO;


@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;
	
	public StudentServiceImpl(StudentDAO theStudentDAO ) {
		studentDAO  = theStudentDAO ;
	}

	@Override
	@Transactional
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	@Override
	@Transactional
	public Student findById(int theId) {
		return studentDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Student theStudent) {
		studentDAO.save(theStudent);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentDAO.deleteById(theId);
	}

}
