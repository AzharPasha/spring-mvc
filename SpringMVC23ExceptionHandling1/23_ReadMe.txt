01. This project is based on Gontu Series video 28.
02. In case when getAdmissionForm method throws some exception then it will return some default error message. If I want to return my own custom message then I need to do below:
	02a. Include a JSP page NullPointerException.jsp
	02b. Include a method with @ExceptionHandler annotation on its top as shown below:
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		//logging Null Pointer Exception
		System.out.println("Null Pointer Exception Occured: " + e);
		return "NulPointerException";
	}
03. Above is also done for IOException. For each known exception, we should add an ExceptionHandler method and its corresponding jsp file.
04. In case if it throws Arithmetic Exception then it will try to look for the @ExceptionHandler annotation for arithematic exception and when it doesn't find then it'll throw the default error.
05. In order to tackle above issue, we can add a generic exception handler method with annotation: @ExceptionHandler(value=Exception.class)