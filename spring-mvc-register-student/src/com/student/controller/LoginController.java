package com.student.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.model.Student;

public class LoginController {
	
	@RequestMapping("/login")
	public String login(ModelMap map) {
	    map.addAttribute("student", new Student());
		return "RegisterStudent";
	}

}
