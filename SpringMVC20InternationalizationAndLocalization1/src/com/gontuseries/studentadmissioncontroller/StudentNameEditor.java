package com.gontuseries.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	//When admission form is submitted, Spring MVC will run setAsText method of this class.
	//Before performing data binding task for studentName property of student object
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException{
		if (studentName.contains("Mr.") || studentName.contains("Ms.") ){
			setValue(studentName);
		}else{
		studentName = "Mr."+studentName;
		setValue(studentName);
		}
   }
}