package com.gontuseries.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	//This allows us to use "headerMessage" object in any of the View present within a controller
	//like "AdmissionForm","AdmissionSuccess"
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","Jawaharlal Nehru Technological University");
		model.addAttribute("headerNote","This text is coming form @ModelAttribute implementation");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1){
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMessage","You are seeing the response WITH @ModelAttribute");
		
		return model;
	}
	
}
