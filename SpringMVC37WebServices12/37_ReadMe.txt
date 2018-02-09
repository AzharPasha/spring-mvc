01. This project is based on Gontu Series video 46. In this tutorial, we'll learn how to build DELETE REST APIs.
02. Requirement: When user makes a DELETE Request (via http://localhost:8080/SpringMVC37WebServices12/students/{name}), application should delete that student's record from the db.
03. Include below REST API Controller method in StudentInfoRESTAPIController.java:
	@RequestMapping(value="/students/{name}",method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("name") String studentName) {
		
		System.out.println("Student Name: "+studentName);
		
		//delete the student record from the database
		
		return new ResponseEntity<Boolean>(true, HttpStatus.OK); 
	}
	If it is going to delete successfully then it will return true otherwise false.
04. Test it out on Postman:
	DELELTE Request: http://localhost:8080/SpringMVC37WebServices12/students/waseem should return 200 OK with response body = true
	Accept = application/xml (If I don't specify any Accept header then the default is xml)
05. To give users flexibility to delete all students records, include below REST API Controller method:
	@RequestMapping(value="/students",method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteAllStudents() {
				
		//delete all student records from the database
		
		return new ResponseEntity<Boolean>(true, HttpStatus.OK); 
	}
	If it is going to delete successfully then it will return true otherwise false.
06. Test it out on Postman:
	DELETE Request: http://localhost:8080/SpringMVC37WebServices12/students should return 200 OK with response body = true
	