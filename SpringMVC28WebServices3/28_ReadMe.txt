01. This project is based on Gontu Series video 35.
02. In this tutorial, we'll learn how to get a student record by student's name. Ex: When I hit http://localhost:8080/SpringMVC28WebServices3/ifza, it should return only Ifza's record.
03. For doing this, we would need to add below Controller method (in StudentAdmissionController.java) to support a new API.

	//*****************Retrieving a Student Records*****************
	@ResponseBody
	@RequestMapping(value="/students/{name}", method = RequestMethod.GET)	//capture student name from REST API into "name" variable
	public Student getStudent(@PathVariable("name") String studentName) {	//assign value of variable "name" to variable "studentName"
		
		//fetch the student's record using "studentName" from DB
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("Quran");
		
		return student;
	}