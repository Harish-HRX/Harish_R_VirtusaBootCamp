<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employer SignUp</title>
</head>
<body>
<body backgroundcolor="black">
<center><h1 style="color:green;">Internal Job Portal</h1></center>
<br><br><br>
<form action="../EmployerController" method="POST">
			<input type="hidden" name="option" value="signUp" />
			<input type="hidden" name="user" value="employer" />
			<table>
				<tbody>
					<tr>
						<td><label>Name:</label></td>
						<td><input type="text" name="Name" /></td>
					</tr><br>
					<tr>
						<td><label>Phone:</label></td>
						<td><input type="text" name="Phone" /></td>
					</tr><br>
						<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="Email" /></td>
					</tr><br>
						<tr>
						<td><label>Password:</label></td>
						<td><input type="password" name="Password" /></td>
					</tr><br>
						<tr>
						<td><label>companyName:</label></td>
						<td><input type="text" name="companyName" /></td>
					</tr><br>
						<tr>
						<td><label>companyType:</label></td>
						<td><input type="text" name="companyType" /></td>
					</tr><br>
						<tr>
						<td><label>Job:</label></td>
						<td><input type="text" name="Job" /></td>
					</tr><br>
					
		</tbody>
		</table>
		<input type="submit" value="SignUp"> 
		</form>
<a href="index.jsp">
<center><b><button id="btn3 Signin">Back</button></b></center>
</a>

</body>
</html>