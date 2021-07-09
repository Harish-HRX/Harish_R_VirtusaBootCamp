
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PostJob</title>
</head>
<body>
<center><h1 style="color:green;">Internal Job Portal</h1></center>
<br><br><br>
<form action="../EmployerController" method="post">
			<input type="hidden" name="option" value="postJobs" />
			<table>
				<tbody>
					<tr>
						<td><label>companyName:</label></td>
						<td><input type="text" name="companyName" /></td>
					</tr>
					<tr>
						<td><label>Job Title:</label></td>
						<td><input type="text" name="JobTitle" /></td>
					</tr>
						<tr>
						<td><label>Languages:</label></td>
						<td><input type="text" name="Languages" /></td>
					</tr>
						<tr>
						<td><label>Password:</label></td>
						<td><input type="password" name="Password" /></td>
					</tr>
						<tr>
						<td><label>Kind of Employment:</label></td>
						<td><input type="text" name="Employment" /></td>
					</tr>
						<tr>
						<td><label>JobDescription:</label></td>
						<td><input type="text" name="JobDescription" /></td>
					</tr>
						<tr>
						<td><label>JobLocation:</label></td>
						<td><input type="text" name="JobLocation" /></td>
					</tr>
		</tbody>
		</table>
				<input type="submit" value="postJob"> 
		</form>
		<a href="EmployerLobby.jsp">
		<center><b><button id="btn3 Signin">Back</button></b></center>
		</a>

</body>
</html>