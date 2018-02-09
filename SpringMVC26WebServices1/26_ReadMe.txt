01. This project is based on Gontu Series video 33. Aim of this class is to create a REST API that returns students names.
02. Steps to create a REST API (http://localhost:8080/SpringMVC26WebServices1/students)
	02a. Include below method in the StudentAdmissionController.java class:
	@ResponseBody
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudentsList() {
	
		Student student1 = new Student();
		student1.setStudentName("Waseem Mohammed");
		
		Student student2 = new Student();
		student2.setStudentName("Mahenaz Farooqui");
		
		Student student3 = new Student();
		student3.setStudentName("Ifza Ayesha Siddiqua");	
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		
		return studentsList;
	
	}
	
	Note: Every request mapping method has a View and Spring MVC uses it to prepare the response. "@ResponseBody" is instructing Spring MVC not to look for "View" technology in this request mapping method to prepare the final response and instead whatever that Controller method is returning, simply convert that to the desired format and send that directly to the Client.
	
	02b. Include below mentioned jars in the lib folder of the demo application. These jars are required to convert the final output into JSON.
	jackson-annotations-2.8.1.jar,jackson-core-2.8.1.jar,jackson-databind-2.8.1.jar
	
	Download these jars from this location http://repo1.maven.org/maven2/com/fasterxml/jackson/core/ - Please find the link in the video description.