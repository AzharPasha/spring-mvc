01. This project is based on Gontu Series video 21. In this tutorial, we'll learn how to write custom Form Validation annotation.
02.	If there is a requirement say that the studentHobby is not valid (other than a list of defined hobbies) and application should give appropriate error message, there is no built in Form Validation annotation present so I have to write my own custom Form Validation annotation.
03. I will create a custom Form Validation annotation with the name - IsValidHobby
	Steps to write a custom Form Validation annotation.
	03a. Create a java file (Called as an annotation type or simply an interface) - having complete definition of this custom annotation
		 like name of the custom annotation, the default error message information etc etc.
	03b. Create a Java file (a class) - having the validation logic used by this custom annotation to validate the user input.
	03c. Write @IsValidHobby on top of studentHobby (in Student.java)
04. A Validator class(in this case, HobbyValidator.java) used by a custom annotation always - implements the ConstraintValidator interface and override two of its methods (with the name - initialize and isValid) as you see in class:HobbyValidator.java