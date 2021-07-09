<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JobSeekerLobby</title>
</head>
<body>
<%
	HttpSession session1=request.getSession(false);
	String user=session1.getAttribute("userName").toString();
	String jobseekerId=session1.getAttribute("userId").toString();
%>
<center><h1 style="color:green;">Internal Job Portal</h1></center>
<br><br><br><br>
<h2>Hello <%=user%> What would like to do today?</h2>
<form action="../jobseekerController">
<input type="hidden" name="option" value="searchjobs" />
<center><b><input type="submit" value="searchJobs"></b></center>
</form>
<br><br><br>
<form action="../jobseekerController">
<input type="hidden" name="option" value="appliedjobs" />
<input type="hidden" name="jobseekerId" value="<%=jobseekerId%>"/>
<center><b><button id="btn3 Signin" value="viewApplications">viewApplications</button></b></center>
</form>
<br><br><br>
<form action="../jobseekerController">
<input type="hidden" name="option" value="logout" />
<center><b><button id="btn3 Signin" value="viewApplications">Logout</button></b></center>
</form>
</body>
</html>