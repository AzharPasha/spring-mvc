01. This project is based on Gontu Series video 22.
02.	We'll parameterize list of hobbies (Aim is to pass list of hobbies from @IsValidHobby annotation in Student.java)
03. To do so,
	03a. Declare a String variable in IsValidHobby.java class as shown below:
	String listOfValidHobbies();
	Note: Here datatype is String because we want @IsValidHobby annotation (Student.java) to accept a String parameter.
	If we want an int parameter then declare an int variable.
	03b. Include String parameter for @IsValidHobby annotation (Student.java) as shown below:
	@IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey")
	03c. Make below changes to HobbyValidator.java class so that it now reads the list of hobbies from Student.java
	private String listOfValidHobbies;
	this.listOfValidHobbies=isValidHobby.listOfValidHobbies();
	if (studentHobby.matches(listOfValidHobbies)) { 
04. Now, if I remove the String parameter from @IsValidHobby annotation then Student.java will give error.
05. If I want to make above String parameter as optional (i.e., if I don't provide a list of hobbies in @IsValidHobby annotation then the given hobby should be compared against some default set of hobbies.) This can be achieved by 
	05a. Include default part in IsValidHobby.java as shown below
	String listOfValidHobbies() default "Music|Football|Cricket|Hockey";
	05b. Remove the String parameter from @IsValidHobby annotation from Student.java class as shown below:
	@IsValidHobby()