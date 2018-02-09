package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoRESTAPIController {
	
	//*****************Retrieving All Student Records*****************
	@RequestMapping(value="/students", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
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
	@RequestMapping(value="/students/{name}", method = RequestMethod.GET)	//capture student name from REST API into "name" variable
	public Student getStudent(@PathVariable("name") String studentName) {	//assign value of variable "name" to variable "studentName"
		
		//fetch the student's record using "studentName" from DB
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("Quran");
		
		return student;
	}

}
