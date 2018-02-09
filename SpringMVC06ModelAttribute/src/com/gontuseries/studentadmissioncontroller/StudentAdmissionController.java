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
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage","Jawaharlal Nehru Technological University");
		model1.addAttribute("headerNote","This text is coming from @ModelAttribute implementation at the method level");
	}
	
	@RequestMapping(value="/submitAdmissionForm1.html",method = RequestMethod.POST )
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, 
											@RequestParam("studentHobby") String hobby){
		Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);
		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("headerMessage","You are seeing the response WITHOUT @ModelAttribute");
		model.addObject("student1",student1);
		
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm2.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm2(@ModelAttribute("student1") Student student1){
		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("headerMessage","You are seeing the response WITH @ModelAttribute");
		
		return model;
	}
	
}
