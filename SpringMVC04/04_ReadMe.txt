01. In this tutorial, we will learn how to pass variables from URL. This covers Gontu Video 09
02. We will learn how to use @PathVariables annotation.
03. In order to use this annotation, we have to include the following in spring-dispatcher-servlet.xml
	<mvc:annotation-driver />
03. There are two ways to define path variables in controller class
	a. Define each path variables separately as controller argument.
	b. Use PathVariable Map in controller argument and then retrieve the value individually.
04. Examples of both of the above is given in this tutorial.