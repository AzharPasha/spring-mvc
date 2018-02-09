01. This project is based on Gontu Series video 45.
02. We would build POST REST APIs when we want users to create a new resource at the server.
03. Requirement: Users to send new student information or a record to the application and app should insert that record into the DB. The existing GET REST API can be later used to read that new student record.
04. Write below method in StudentInfoRESTAPIController.java
	@RequestMapping(value="/students",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)	//It only accepts json request because of consumes
	public ResponseEntity<Boolean> postStudent(@RequestBody Student student) {
		
		System.out.println("Student Name: "+student.getStudentName()+"Student Hobby: "+student.getStudentHobby());
		//insert the student record into the database
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(
					"Location",
					ServletUriComponentsBuilder.fromCurrentRequest()
						.path("/{name}")
						.buildAndExpand(student.getStudentName()).toUri()
						.toString());
		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.CREATED);
	}

05. When a user is going to make below POST request, a new record is inserted into the db. If successfully inserted, it is going to return true (201 Created - as per the code) otherwise it'll return false (500 Erro).
	POST Request: http://localhost:8080/SpringMVC36WebServices11/students
	{
		"student_name":"name",
		"studentHobby":"hobby"
	}
	In addition to this, it has returned location response header (Location = http://localhost:8080/SpringMVC36WebServices11/students/name). This means that whatever resource has been inserted, can be read using this GET REST API.
