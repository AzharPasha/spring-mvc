01. This project is based on Gontu Series video 19
02. In this tutorial, we learnt how to parameterize arguments in properties file.
	02a. Placeholder {0} is always replaced dynamically by Spring MVC with the name of field for which violation occurs.
	Eg: In this demo, violation occured for studentHobby field; so {0} was replaced with 'studentHobby'
	02b. Placeholders {1},{2},{3},{4} and so on...would be replaced with the arguments values passed to the constraint annotation.
	Eg: In this demo, we passed two arguments to @Size annotation i.e min=3 and max=30; so, placeholders {1} and {2} were replaced with these arguments values.
	02c. Why in this demo, placeholder {1} was replaced with the max argument value i.e 30 and not with the min argument value i.e 2 (in the similar ways, why {2} was replaced with the min value and not with the max value)????
	Answer: Its because Spring MVC uses alphabetical order of the arguments to decide upon which placeholder to be replaced with which argument value: In this demo, if we observe alphabetically - max comes before min argument ---> so, {1} was replaced with the max value and {2} was replaced with the min value.
03. Server should be restarted if the properties file is changed. If you don't want to restart server everytime then write below line in spring-dispatcher-servlet.xml file -> inside messageSource bean. This should not be done in production env as it will degrade the performance.
	<property name="cacheSeconds" value="1" />