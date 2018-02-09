01. This project is based on Gontu Series video 42. In this tutorial, we'll learn how to restrict user to only use one format for the PUT request (not the response format)
02. This can be done using consumes argument to @RequestMapping annotation as shown in StudentInfoRESTAPIController.java class. 
03. In order for the application to only accept xml request, set consumes=MediaType.APPLICATION_XML_VALUE and for json only, set consumes=MediaType.APPLICATION_JSON_VALUE
04. Test it out on Postman
	03a. PUT Request: http://localhost:8080/SpringMVC33WebServices8/students/ifza should return 200 OK with body message = true
	Accept: application/xml
	Content-Type: application/xml
	Body:
	<Student>
		<student_name>Ifza Ayesha Siddiqua</student_name>
		<studentHobby>Tableegh</studentHobby>
	</Student>
	03b. PUT Request: http://localhost:8080/SpringMVC33WebServices8/students/ifza should return 500 error with unknown error exception.
	Accept: application/xml
	Content-Type: application/json
	Body:
	{
		"student_name":"Ifza Ayesha Siddiqua",
		"studentHobby":"Tableegh"
	}