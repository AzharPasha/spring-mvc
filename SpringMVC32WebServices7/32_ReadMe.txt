01. This project is based on Gontu Series videos 40 and 41.
02. Aim is to develop a REST API (http://localhost:8080/SpringMVC32WebServices7/students/{name}) so that the Clients would make a PUT request on this API. Clients would specify {name} (which they want to modify at the server side) along with the information (like name, hobby) in the xml or json format.
	http://localhost:8080/SpringMVC32WebServices7/{name}
	
	{
		"student_name":"name",
		"studentHobby":"hobby"
	}
	
	OR
	
	<Student>
		<student_name>name</student_name>
		<studentHobby>hobby</studentHobby>
	</Student>

03. For this, I need to include a new REST API Controller method as shown below in StudentInfoRestAPIController.java
	
	public boolean updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {	//
		
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Name: "+student.getStudentName()+"Student Hobby: "+student.getStudentHobby());
		
		//find the matching student record using "studentName" from the DB
		//update the matching student record with the information of student sent by the client
		
		//return true if update is successfully done and return false if update is not done successfully
		return true;
	}
	
	@PathVariable : It will simply extract the value of "name" (provided by the user) and assign it to variable "studentName".
	@RequestBody : a) If it finds that the information has come in xml format then it makes use of xml related jars which are present in the class path of this project to convert xml message into its equivalent java object ("student"). Similarly it automatically converts the json format into its equivalent java object.
				   b) It knows the format by Content-Type header. 
				   c) So in short, it will map the incoming param values (from PUT method) to the properties of Student object.
	
04. Test it out on Postman.
	PUT: http://localhost:8080/SpringMVC32WebServices7/students/ifza
	Body:
	{
		"student_name":"Ifza1",
		"studentHobby":"Tableegh"
	}
	Accept: application/xml
	Content-Type: application/json
	Output: It should return "true" with 200 OK