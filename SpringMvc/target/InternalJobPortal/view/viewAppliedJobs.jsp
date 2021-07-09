<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>

<head>
	<title>Available Jobs</title>	
	
</head>
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
	<div id="wrapper">
		<div id="header">
			<h2>Internal Job Portal</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Job Title</th>
					<th>Company Name</th>
					<th>Job Location</th>
					<th>Job Description</th>
					<th>Employment</th>
					<th>Languages Required</th>
				</tr>
				<c:forEach var="job" items="${appliedjobs}">
					<tr>
						<td> ${job.getJobTitle()    }</td>
						<td> ${job.getCompanyName() } </td>
						<td> ${job.getJobLocation() }</td>
						<td> ${job.getJobDescription()}</td>
						<td> ${job.getEmployment()  }</td>
						<td> ${job.getLanguage()    }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>