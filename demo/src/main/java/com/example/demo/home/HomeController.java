package com.example.demo.home;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController
{
	/*
	 * @RequestMapping("home") public ModelAndView home(@RequestParam("name") String myName, int id, ModelAndView mv) {
	 *  mv.addObject("name", myName);
	 *  mv.addObject("id", id);
	 *  mv.setViewName("Home"); return mv; }
	 */
	
	@RequestMapping("home")	
	public String home() {
		return "Welcome";
	}
}
