package com.gl.studentManagement.repository;

import java.util.List;

import com.gl.studentManagement.entity.Student;

public interface StudentDAO {
	
	public  List<Student> findAll();
	
	public Student findById(int theId);
	
	public void save(Student theStudent);
	
	public void deleteById(int theId);
	
	
			
}
