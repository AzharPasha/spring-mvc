01. This project is based on Gontu Series video 29.
02. An Exception Handler method is only applicable to the Controller class where it is present. It cannot be applied or used by framework for exceptions thrown by other Controller classes. So we have to end up writing same exception handler methods in multiple Controller classes so there is lot of redundancy.
03. The way to overcome above is to have a separate class in your application with @ControllerAdvice annotation on its top then whatever exception handler methods that you put in such a class, all those would be applied to all Controller classes which stays in the application.
04. Steps taken to implement above:
	04a. Included a class (GlobalExceptionHandlerMethod.java)
	04b. Move all exception handler methods from StudentAdmissionController.java class to GlobbalExceptionHandlerMethod.java
05. Alternately, I can simply modify spring-dispatcher-servlet.xml (by including below code snippet) file without creating a separate class and it would do exactly same thing.
	<bean id="simpleMappingExceptionResolver"
		  class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
		<property name="exceptionMappings">
			<map>
				<entry key="NullPointerException" value="NullPointerException"/>
				<entry key="IOException" value="IOException"/>
			</map>
		</property>
		<!-- This is the default error webpage or the generic error webpage -->
		<property name="defaultErrorView" value="Exception"/>
		
		<!-- Name of logger to use to log exceptions. Unset by default, so logging disabled -->
		<property name="warnLogCategory" value="MVCLogger"/>
	</bean>
06. In the next tutorial, we'll go ahead with approach 1 (step 4) so deleting code for approach 2 (step 5) in next tutorial.