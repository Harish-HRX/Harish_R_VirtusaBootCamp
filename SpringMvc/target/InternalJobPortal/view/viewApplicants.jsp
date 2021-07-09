<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.*,model.Jobseeker" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	Map<String,Jobseeker> applicants=(Map<String,Jobseeker>)request.getAttribute("applicants");
%>
<body>
<style>
table{
width:800px;
}
th,caption{
text-align: left;
}
table,th,td{
border: 1px solid  #000;
border-collapse: collapse;
}
caption{
color: red;
}
th,td{
padding: 10px;
}
tr:nth-child(even) {
	background-color: #fff;
}
tr:nth-child(odd) {
	background-color: #ddd;
}
</style>
<table>
<h2><caption>Applicants</caption></h2>
<tr>
<th>Name</th>
<th>E-mail Id</th>
<th>PhoneNumber</th>
<th>City</th>
<th>Experience</th>
</tr>

<%for(Map.Entry<String,Jobseeker> jk : applicants.entrySet()){%>
	<tr>
				<td> <%=jk.getValue().getName() %> </td>
				<td> <%=jk.getValue().getEmail() %> </td>
				<td> <%=jk.getValue().getPhone() %> </td>
				<td> <%=jk.getValue().getCity() %> </td>
				<td> <%=jk.getValue().getExperience() %> </td>
			</tr>
		

<% }%>
</table>
</body>
</html>