01. This project is based on Gontu Series video 44. In this tutorial, we'll learn how to send our customized http response headers within the REST API Controller method (updateStudent method in StudentInfoRESTAPIController.java)
02. Some imp response headers:
	Cache-Control -> Tells all caching mechanisms from server to client whether they may cache this object. It is measured in seconds.
	Content-Encoding -> The type of encoding used on the data.
	Content-Language -> The natural language or languages of the intended audience for the enclosed content.
	Content-Location -> An alternate location for the returned data.
	Refresh -> Used in redirection, or when a new resource has been created. This refresh redirects after 5 seconds.
	etc... visit -> https://en.wikipedia.org/wiki/List_of_HTTP_header_fields for the complete list.
03. To create above header/(s), create an object of HttpHeaders class and then add key value pairs as shown below:
	HttpHeaders httpHeaders = new HttpHeaders();
	httpHeaders.add("key1", "value1");
	httpHeaders.add("key2", "value2");
04. Then pass the object reference (httpHeaders) as the second argument to the ResponseEntity constructor as shown below:
	return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.OK);
05. Test it out on Postman
	PUT Request: http://localhost:8080/SpringMVC35WebServices10/students/ifza should return both response headers.
	Accept: application/xml
	Content-Type: application/xml
	Body:
	<Student>
		<student_name>Ifza Ayesha Siddiqua</student_name>
		<studentHobby>Tableegh</studentHobby>
	</Student>
06. Note: ResponseEntity arguments 
	When we pass only argument, it considers it to be the response status.
	When we pass two arguments, it considers first one to be the body message and second one to be the response status.
	When we pass three arguments, it considers first one to be the body message, second one to be the response headers and third one to be the response status.
	