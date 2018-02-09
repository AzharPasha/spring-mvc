01. This project is based on Gontu Series video 30. In this tutorial, we'll learn about response status.
02. With every response, server sends an appropriate response code (200 means successfully processed, 404 Not Found, 500 Internal Server Error, 503 Service Unavailable error). 
	For the complete list of Status codes, please visit: http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html
03. When I request http://localhost:8080/SpringMVC25ExceptionHandling3/admissionForm.html in postman, it returns the unknown error customized exception error message but the status code = 200 OK.
04. To handle above, include @ResponseStatus annotation on top of exception handler method as shown in class GlobalExceptionHandlerMethod.java
05. Now, when I request http://localhost:8080/SpringMVC25ExceptionHandling3/admissionForm.html in postman, it returns the unknown error customized exception error message with status code = 500 Internal Server Error.