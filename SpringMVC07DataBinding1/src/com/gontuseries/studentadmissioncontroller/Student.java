package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	private String studentName;
	private String studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	
	public String getStudentName(){
		return studentName;
	}
	
	public String getStudentHobby(){
		return studentHobby;
	}
	
	public Long getStudentMobile(){
		return studentMobile;
	}
	public Date getStudentDOB(){
		return studentDOB;
	}
	public ArrayList<String> getStudentSkills(){
		return studentSkills;
	}
	
	
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	
	public void setStudentHobby(String studentHobby){
		this.studentHobby = studentHobby;
	}
	
	public void setStudentMobile(Long mobile){
		this.studentMobile = mobile;
	}
	
	public void setStudentDOB(Date dob){
		this.studentDOB = dob;
	}
	
	public void setStudentSkills(ArrayList<String> skills){
		this.studentSkills = skills;
	}
}
