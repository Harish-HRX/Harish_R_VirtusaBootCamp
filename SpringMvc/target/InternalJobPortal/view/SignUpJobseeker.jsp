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
<form action="../JobseekerController" method="POST">
			<input type="hidden" name="option" value="signUp" />
			<input type="hidden" name="user" value="jobseeker" />
			<table>
				<tbody>
					<tr>
						<td><label>Name:</label></td>
						<td><input type="text" name="Name" /></td>
					</tr><br>
					<tr>
						<td><label>Password:</label></td>
						<td><input type="text" name="Password" /></td>
					</tr><br>
						<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="Email" /></td>
					</tr><br>
						<tr>
						<td><label>Phone:</label></td>
						<td><input type="text" name="Phone" /></td>
					</tr><br>
						<tr>
						<td><label>Experience:</label></td>
						<td><input type="text" name="Experience" /></td>
					</tr><br>
						<tr>
						<td><label>City:</label></td>
						<td><input type="text" name="City" /></td>
					</tr><br>
						<tr>
		</tbody>
		</table>
		<input type="submit" value="SignUp"> 
		</form>
<a href="index.jsp">
<center><b><button id="btn3 Signin">Back</button></b></center>
</a>

</body>
</html>