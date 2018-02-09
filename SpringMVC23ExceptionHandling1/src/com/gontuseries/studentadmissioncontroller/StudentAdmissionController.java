package com.gontuseries.studentadmissioncontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
//		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		String exceptionOccured = "ARITHMETIC_Exception";
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		} else if(exceptionOccured.equalsIgnoreCase("IO_Exception")) {
			throw new IOException("IO Exception");
		} else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_Exception")) {
			throw new ArithmeticException("Arithmetic Exception");
		}
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
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMessage","You are seeing the response WITH @ModelAttribute");
		
		return model;
	}
	
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		
		//logging Null Pointer Exception
		System.out.println("Null Pointer Exception Occured: " + e);
		return "NullPointerException";
	}
	
	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {
		
		//logging IO Exception
		System.out.println("Null Pointer Exception Occured: " + e);
		return "IOException";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		
		//logging Generic Unknown Exception
		System.out.println("Unknown Exception Occured: " + e);
		return "Exception";
	}
	
}
