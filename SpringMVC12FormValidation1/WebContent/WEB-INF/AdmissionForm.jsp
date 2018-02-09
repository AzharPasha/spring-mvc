<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>
	<h1>${headerMessage}</h1>
	<p>${headerNote} </p>
	<form:errors path="student1.*" />
	<form action="/SpringMVC12FormValidation1/submitAdmissionForm.html" method = "post">
		
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
		<table>
			<tr> <td>Student Address </td> </tr>
			<tr> <td>Street: <input type="text" name="studentAddress.street" /></td> </tr>
			<tr> <td>City: <input type="text" name="studentAddress.city" /></td> </tr>
			<tr> <td>Zip Code: <input type="text" name="studentAddress.zipcode" /></td> </tr>
			<tr> <td>Country: <input type="text" name="studentAddress.country" /></td> </tr>
		</table>
	
	<input type="submit" value="Submit" />		
	</form>
	

</body>




</html>