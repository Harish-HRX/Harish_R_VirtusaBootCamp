<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JobSeeker SignIn</title>
</head>
<body>
<body backgroundcolor="black">
<center><h1 style="color:green;">Internal Job Portal</h1></center>
<br><br><br>
<form action="jobseekerController" method="POST">
			<input type="hidden" name="option" value="signIn" />
			<input type="hidden" name="user" value="jobseeker" />
			<table>
				<tbody>
					<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="Email" /></td>
					</tr><br>
					<tr>
						<td><label>Password:</label></td>
						<td><input type="text" name="Password" /></td>
					</tr><br>
		</tbody>
		</table>
		<input type="submit" value="SignIn">
		</form>
<a href="">

</a>
<a href="index.jsp">
<center><b><button id="btn3 Signin">Back</button></b></center>
</a>

</body>
</html>