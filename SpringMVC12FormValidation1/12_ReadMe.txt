01. This project is based on Gontu Series video 17 and some part of video 18
02. Here we will define some of the form validations
03. Assume that the project requirement is - Hobby field should be Min 2 characters and Max 30 characters.
04. This requirement can be easily achieved with the following changes
	a. first add @size annotation above the hobby property inside Student.java
	b. secondly add @Valid annotation to Controller "submitAdmissionForm"
	c. Import the bean validator libraries from http://hibernate.org/validator/downloads
		- classmate-1.0.0
		- hibernate-validator-5.1.2.Final
		- jboss-logging-3.1.3.GA
		- validation-api-1.1.0.Final
05. In order to see the code working, submit the admission form with Hobby as 1 character and see the springmvc
	displays default error message as Size must be between 2 and 30.

--------------
06. In order to provide a user friendly message other than the default then the @Size annotation should be declared
	as:
	@Size(min=2, max=30, message = "Student Hobby Field must be between 2 and 30 characters")
07. min and max values can dynamically be used in the message as shown below:
	@Size(min=2, max=30, message = "Student Hobby Field must be between {min} and {max} characters")