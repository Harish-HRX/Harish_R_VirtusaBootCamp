<%@ taglib uri="http://java.sun.com/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployerLobby</title>
</head>
<body>
<%
	HttpSession session1=request.getSession(false);
	String user="";
	if(session1.getAttribute("userName")!=null)
		user=session1.getAttribute("userName").toString();
%>
<center><h1 style="color:green;">Internal Job Portal</h1></center>
<br><br><br><br>
<h2>Hello <%=user%>, What would like to do today?</h2>

<c:url var="link" value="../employerController">
	<c:param name="option" value="viewApplicants"/>
</c:url>
<a href="${link}">
<input type="hidden" name="option" value="signUp" />
<center><b><button id="btn3 Signin">viewApplicants</button></b></center>
</a><br><br><br>

<a href="PostJobs.jsp">
<center><b><button id="btn3 Signin">postJobs</button></b></center>
</a>
<br><br><br>

<a href="index.jsp">
<center><b><button id="btn3 Signin">Logout</button></b></center>
</a>
</body>