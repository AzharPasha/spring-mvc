package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {

	@RequestMapping("/welcome/{userName}/{countryName}")
	public ModelAndView helloWorld(@PathVariable("userName") String name, 
			@PathVariable("countryName") String country ){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Welcome "+name+". So You are watching me from "+country);
		return model;
	}
	
	@RequestMapping("/hi/{userName}/{countryName}")
	public ModelAndView hiWorld(@PathVariable Map<String, String> pathVars){
		
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Hi "+name+". So You are watching me from "+country);
		return model;
	}
	

}
