<html>

<body>
	<h1>${headerMessage}</h1>
	<p>${headerNote} </p>
	<form action="/SpringMVC06ModelAttribute/submitAdmissionForm1.html" method = "post">
		<h3>This example DOES NOT use @ModelAndView</h3>
		<p> Student Name: <input type="text" name="studentName"/></p>
		<p> Student Hobby: <input type="text" name="studentHobby"/> </p>
		<input type="submit" value="Submit" />	
	</form>
	<hr>
	<form action="/SpringMVC06ModelAttribute/submitAdmissionForm2.html" method = "post">
		<h3>This example uses @ModelAndView</h3>
		<p> Student Name: <input type="text" name="studentName"/></p>
		<p> Student Hobby: <input type="text" name="studentHobby"/> </p>
		<input type="submit" value="Submit" />	
	</form>
	

</body>




</html>