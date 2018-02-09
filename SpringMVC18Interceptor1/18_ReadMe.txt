01. This project is based on Gontu Series video 23
02. We use Interceptor in cases like when we want our website to work on all week days except Sundays (Eg: some websites gives maintenance message on a specific day)
03. Steps to instruct Spring MVC to perform some task before handling a request:
	03a. Include a Java class (In this tutorial, we added DayOfWeekBasedAccessInterceptor.java) which extends HandlerInterceptorAdapter class and overrides one of its methods with the name preHandle.
	03b. Write the code in the preHandle method which you want Spring MVC to execute before handling the request.
	03c. Put an entry of this newly added Java class in the Spring's configuration file (spring-dispatcher-servlet.xml) as shown below:
	<mvc:interceptors>
		<bean class="com.gontuseries.studentadmissioncontroller.DayOfWeekBasedAccessInterceptor" />
	</mvc:interceptors>	
05. As per the code written in this class, when you try to access http://localhost:8080/SpringMVC18Interceptor1/admissionForm.html on Sunday, it should return website closed message and should be accessible on any other day.