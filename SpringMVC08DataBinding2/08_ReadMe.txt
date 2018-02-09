00. These notes are related to video 14
01. In this tutorial we will define user defined object like "Address" and learn how to bind HTML's address data to 
	student object.
02. Then we learn about data binding errors.
03. For example if we type "ABC" for phone number, the application will throw error.
04. One way we can handle application with bad data,  is to send back the same application with error explaining what need to be fixed.
05. To handle binding error, we will include "Binding result" argument in submitAdmissionForm method.
06. Also we will add <form:errors path="student1.*" /> above the form element in AdmissionForm.jsp

