package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController  extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelandview = new ModelAndView("HelloPage");	//The view name which Front Controller would use to prepare the response is “HelloPage”
		modelandview.addObject("welcomeMessage","Welcome to the first Spring MVC Application");	//Prepare the ModelAndView object which is having the data to be displayed on the response web page
		
		return modelandview;	//Java Object holding data is sent back to the Front Controller
	}

}
