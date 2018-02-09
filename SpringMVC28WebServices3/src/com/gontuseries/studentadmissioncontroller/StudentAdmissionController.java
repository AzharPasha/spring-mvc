package com.gontuseries.studentadmissioncontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	//*****************Retrieving All Student Records*****************
	@ResponseBody
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudentsList() {
	
		Student student1 = new Student();
		student1.setStudentName("Waseem Mohammed");
		
		Student student2 = new Student();
		student2.setStudentName("Mahenaz Farooqui");
		
		Student student3 = new Student();
		student3.setStudentName("Ifza Ayesha Siddiqua");	
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		
		return studentsList;
	
	}
	
	//*****************Retrieving a Student Records*****************
	@ResponseBody
	@RequestMapping(value="/students/{name}", method = RequestMethod.GET)	//capture student name from REST API into "name" variable
	public Student getStudent(@PathVariable("name") String studentName) {	//assign value of variable "name" to variable "studentName"
		
		//fetch the student's record using "studentName" from DB
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("Quran");
		
		return student;
	}
	
	
}
