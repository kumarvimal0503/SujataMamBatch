package com.indiracollege.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cityName")
public class CityController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayCity(Model model) {
		
		model.addAttribute("city", "Mumbai");
		
		return "cityName";
		
	}
	
	
}
