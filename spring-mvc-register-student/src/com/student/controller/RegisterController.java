package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;
import com.student.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	public RegisterService registerService;
	
	@RequestMapping("/register")
	//public ModelAndView register() {
		//return new ModelAndView("RegisterStudent","student", new Student());
	//}
	
	public String register(ModelMap map) {
		    map.addAttribute("student", new Student());
			return "RegisterStudent";
		}
	
	
	@RequestMapping(value="/registerStudent", method=RequestMethod.POST)
	public String registerStudent(ModelMap map, @ModelAttribute("student") Student student){
		//Student student = new Student();
		registerService.registerStudent(student);
		map.addAttribute("username",student.getUsername());
		return "Welcome";
	}

}
