package com.gl.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	//add request mapping for access-denied
	
	@GetMapping("/student/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
	}
	
	@GetMapping("/student/logout")
	public String logout() {
		
	 return "redirect:/login";
	}
	
	

}
