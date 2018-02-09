01. This project is based on Gontu Series video 18. In this tutorial, we learnt how to manage all custom error messages in properties file.
02. To keep all the custom error messages in a properties file, make use of Spring Message Source. 
	To make this work, create .properties file and include below code snippet in spring-dispatcher-servlet.xml file.
	<bean id="messageSource"
		class="org.springframework.context.support.ReloadableResourceBundleMessageSource">
		
		<property name="basename" value="WEB-INF/studentmessages" />
	</bean>
03. Spring MVC searches for a key matching below key pattern:
	[Validation Annotation Name].[Object Reference Name].[Field Name]
	Eg: In this case, Size.student1.studentHobby
	If above key pattern is not found, then Spring MVC would again search for a key matching with below key pattern:
	[Validation Annotation Name].[Field Name]
	Eg: In this case, Size.studentHobby
	If above key pattern is not found, then Spring MVC would again search for a key matching with below key pattern:
	[Validation Annotation Name].[Field Type]
	Eg: In this case, Size.java.lang.String
	If above key pattern is not found, then Spring MVC would finally search for a key matching with below key pattern:
	[Validation Annotation Name]
	Eg: In this case, Size
	If above key pattern is also not found, then Spring MVC would use the default error message for that constraint violation.
	Eg: In this case, size must be between 2 and 30 (default error message for Size constraint)