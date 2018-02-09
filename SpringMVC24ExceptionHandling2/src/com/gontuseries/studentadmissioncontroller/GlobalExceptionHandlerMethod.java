package com.gontuseries.studentadmissioncontroller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerMethod {
	
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
