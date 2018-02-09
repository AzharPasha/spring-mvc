01. This project is based on Gontu Series video 39. In this tutorial, we'll learn how a Controller method can support only one response format (say only json not xml).
02. Above can be done using produces argument to @RequestMapping annotation as shown in StudentInfoRESTAPIController.java class.
	For xml only, set produces=MediaType.APPLICATION_XML_VALUE and for json only, set produces=MediaType.APPLICATION_JSON_VALUE
03. After setting produces=MediaType.APPLICATION_XML_VALUE, test it out on Postman:
	03a. Request http://localhost:8080/SpringMVC31WebServices6/students with json accept header, it should return json response with 200 OK
	03b. Request http://localhost:8080/SpringMVC31WebServices6/students with xml accept header, it should return unknown error with 500 Internal Server Error. 