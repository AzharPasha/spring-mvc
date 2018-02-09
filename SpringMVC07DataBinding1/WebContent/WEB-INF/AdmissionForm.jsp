<html>

<body>
	<h1>${headerMessage}</h1>
	<p>${headerNote} </p>
	<form action="/SpringMVC07DataBinding1/submitAdmissionForm.html" method = "post">
		
		<table>
		<tr>
		<td> Student Name: </td> <td> <input type="text" name="studentName"/> </td>
		</tr>
		
		<tr>
		<td> Student Hobby: </td> <td> <input type="text" name="studentHobby"/> </td>
		</tr>
		
		<tr>
		<td>Student Mobile: </td><td><input type="text" name="studentMobile"/> </td>
		</tr>
		
		<tr>
		<td>Student DateOfBirth: </td> <td><input type = "text" name="studentDOB"/> </td>
		</tr>
		
		<tr>
		<td>Student Skills </td> <td> <select name="studentSkills" multiple>
									  <option value="Java Core">Java Core </option>
									  <option value="Spring Core">Spring Core </option>
									  <option value="Spring MVC">Spring MVC</option>
									 </select>
								 </td>
		</tr>
		
		</table>
	<input type="submit" value="Submit" />		
	</form>
	

</body>




</html>