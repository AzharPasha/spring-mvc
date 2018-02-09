01. This project is based on Gontu Series video 20.
02. If there is a requirement say if studentName contains number then application should return appropriate error message, use @Pattern on studentName (Student.java) as shown below:
	@Pattern(regexp="[0-9]*")
03. To learn more about @Pattern annotation, visit http://en.wikipedia.org/wiki/Regular_expression
---------------------
04. If there is a requirement say if date is in future then application should return appropriate error, use @Past on studentDOB (Student.java) as shown below:
	@Past
---------------------
05. If there is a requirement say the studentMobile > 2222 then application should give appropriate error, use @Max annotation on studentMobile (Student.java) as shown below:
	@Max(2222)
06. In the similar manner,
	@Future: Checks whether the annotated date is in the future.
	@Min: Check whether the annotated value is higher than or equal to the specified minimum.
	@NotNull: Check that the annotated value is not null.
	@NotEmpty: Check if the string is not null nor Empty. (@NotEmpty is not supported by Bean Validation specification...Its only available to developers if they are using Hibernate Validator Library in their Spring MVC Application)