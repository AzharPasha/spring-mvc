01. This project is based on Gontu Series video 24.
02. If we want Spring MVC to do some task after executing request handler method (inside Controller class) then it can be done by overriding postHandle method as shown in DayOfWeekBasedAccessInterceptor class.
03. If we want Spring MVC to do some task after the response object is produced by the view (inside Request Handler method) then it can be done by overriding afterCompletion method as shown in DayOfWeekBasedAccessInterceptor class.
04. To test it out: Hit http://localhost:8080/SpringMVC19Interceptor2/admissionForm.html and check that the postHandle and afterCompletion messages are printed in the Console.
05. If I want this application to consider this Interceptor class only for a specific URL request and not for every URL request which would be coming into this application, do below in spring-dispatcher-servlet.xml file
	<mvc:interceptors>
		<mvc:interceptor>
		<mvc:mapping path="admissionForm.html"/>	
		<bean class="com.gontuseries.studentadmissioncontroller.DayOfWeekBasedAccessInterceptor" />
		</mvc:interceptor>
	</mvc:interceptors>