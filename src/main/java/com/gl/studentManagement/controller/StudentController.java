package com.gl.studentManagement.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.studentManagement.entity.Student;
import com.gl.studentManagement.service.StudentService;



@Controller
@RequestMapping("/student")
public class StudentController {

	private StudentService studentService;
	
	//@Autowired
	public StudentController(StudentService theStudentService) {
		studentService=theStudentService;
	}
		
	@GetMapping("/list")
	public String listStudents(Model theModel) {

		// get students from DAO
		List<Student> theStudents = studentService.findAll();;

		// add the students to our spring mvc model
		theModel.addAttribute("students", theStudents);

		return "list-students";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Student theStudent = new Student();

		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {

		// save the student
		studentService.save(theStudent);
		return "redirect:/student/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {

		// get student from our service/DAO
		Student theStudent = studentService.findById(theId);

		// set student as a model attribute to pre-populate the form
		theModel.addAttribute("student", theStudent);

		// send over to our form
		return "student-form";

	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int theId) {

		// delete the student
		studentService.deleteById(theId);
		return "redirect:/student/list";
	}
	
	
	
}
