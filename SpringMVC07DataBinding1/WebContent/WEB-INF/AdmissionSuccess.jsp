<html>
	<body>
	
		<h1>${headerMessage}</h1>
		<p>${headerNote }</p>
		<h3>Congratulations...The Engineering College has processed your application successfully</h3>
		<h2>Details submitted by you::</h2>
		<table>
			<tr>
				<td>Student Name: </td><td>${student1.studentName} </td>
			</tr>
			<tr>
				<td>Student Hobby: </td><td>${student1.studentHobby}</td>
			</tr>
			<tr> 
				<td>Student Mobile:</td> <td>${student1.studentMobile } </td>
			</tr>
			<tr> 
				<td>Student DateOfBirth:</td> <td>${student1.studentDOB } </td>
			</tr>
			<tr> 
				<td>Student Skills:</td> <td>${student1.studentSkills } </td>
			</tr>
		</table>
	</body>

</html>