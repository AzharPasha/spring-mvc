01. These notes are based on gontu series video 15
02. In our previous project, if we have a specific requirement that all form elements should be binded except Mobile
	then such requirement can be achieved using WebDataBinder and @InitBinder annotation
03. Hence in our controller class, we put the following piece of code:
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"studentMobile"});
		}
04. Note that we can name the above method anything you like, I have used initBinder.

05. Now, when we submit the admission Form, we will get all our values back except the mobile number.
	Check it out ourself by submitting form: localhost:8080/SpringMVC09DataBinding3/admissionForm.html

------------------------------------------------------
06. Now let's look at another spring feature called "Property Editor"

07. Currently the date field in the form is in the format: YYYY/MM/DD. That means, if we try to submit form 
	in format like 2014-11-01 then the form will throw error.
 
08. What if, we want to change the format to MM-DD-YYYY ? This can be achieved thru Property Editors

09. So, we add the following 2 lines of code inside @InitBinder annotation
	SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
	binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat,false));

10. So we have registered a new method of date for our student DOB element.

11. Apart from CustomDateEditor, spring offers number of property editors like CustomNumberEditor,
	CustomerFileEditor, CustomerClassEditor
