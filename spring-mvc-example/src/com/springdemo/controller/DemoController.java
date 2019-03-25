package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	@RequestMapping("/display")
	public String display() {
		return "Display";
	}
	
	@RequestMapping("/Add")
	public String add() {
		return "Add";
	}
	
	@RequestMapping("/addNumbers")
	public String addnumbers (@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelMap map) {
		map.addAttribute("message","The sum of "+num1+" and "+num2+" is "+(num1+num2));
		return "DisplayAdd";
	}

}
