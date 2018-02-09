00. These notes cover video 11 and 12
01. This tutorials explains how we can create a student class object and add it to the ModelAndView.

02. Then we were able to access the object parameters in the AdmissionSuccess.jsp
	http://localhost:8080/SpringMVC06ModelAttribute/admissionForm.html
	
03. Notice the following in above exmaple:
	a. we first defined @RequestMapping parameters
	b. then create instance of student class
	c. then binded the request parameters to the object parameters
	d. finally added student object to ModelAndView.
	That's a lot of work which can be avoided using @ModelAttribute
	
04. In this example we will be seeing  @ModelAttribute as an argument of controller method.
	So when I use @ModelAttribute annotation on a method argument then I expect Spring MVC to 1) extract all the request params 2) bind them with the corresponding properties of "Student" Object 3) finally add student object to ModelAndView.	
	
05. @ModelAttribute can be used at the method level
	When @ModelAttribute is used at the method level, Spring MVC always makes a call to this method before calling any request handler methods.
	This allows to write common messages of all request handler methods and then extract in any jsp files.