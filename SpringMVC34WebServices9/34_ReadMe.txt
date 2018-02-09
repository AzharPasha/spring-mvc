01. This project is based on Gontu Series video 43.
02. Right now our application is returning 200 OK with body message = true (when we do a PUT request from previous class). The body message is not imp if it is successfully processed at the server side. 
03. If we don't return any body message, problem is that if any of the steps inside updateStudent method fails and if the control reaches end of method then application assumes it to be successful and returns 200 OK which we don't want to happen. Ex: If the user provided studentName do not exist in DB then it will skip remaining steps and reach end of the method and returns 200 OK which is wrong. Instead it should return 404 Not Found in this case.

04. Steps 2 and 3 can be achieved using ResponseEntity on updateStudent method (return new ResponseEntity<Void>(HttpStatus.OK);). Similarly, if we want to return 404 at some point then use the same statement and change it to return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	public ResponseEntity<Void> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {	//
		
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Name: "+student.getStudentName()+"Student Hobby: "+student.getStudentHobby());
		
		//find the matching student record using "studentName" from the DB
		//update the matching student record with the information of student sent by the client
		
		//return true if update is successfully done and return false if update is not done successfully
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
05. Test it out on Postman
	PUT Request: http://localhost:8080/SpringMVC34WebServices9/students/ifza should return 200 OK without body message
	Accept: application/xml
	Content-Type: application/xml
	Body:
	<Student>
		<student_name>Ifza Ayesha Siddiqua</student_name>
		<studentHobby>Tableegh</studentHobby>
	</Student>
	
06. Using ResponseEntity, if we also want to send body message along with status code then, use below. First argument is considered as body message and second argument as status code.
	public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {	//
		
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Name: "+student.getStudentName()+"Student Hobby: "+student.getStudentHobby());
		
		//find the matching student record using "studentName" from the DB
		//update the matching student record with the information of student sent by the client
		
		//return true if update is successfully done and return false if update is not done successfully
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);

07. Repeat step 5. Now I should also see body message along with status code