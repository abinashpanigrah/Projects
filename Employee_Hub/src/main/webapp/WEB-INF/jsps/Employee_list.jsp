<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> <!-- JSTL Directive Tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employees</title>
</head>
<body>
	<table border=1>
	<tr><th colspan="18" bgcolor="lightgrey"><font size="6"> LIST OF EMPLOYEES </font></th></tr>
	<tr bgcolor="lightgrey" style="font-size:21px; padding:10px; text-align:center;">
	<th>Id No.</th><th>EmpID</th><th>First Name</th><th>Last Name</th><th>Gender</th><th>DOB</th>
	<th>Phone Number</th><th>Email</th><th>Address</th><th>Job Title</th><th>Joining Date</th><th colspan="
	2">Action</th>
	</tr>
	<c:forEach var="employees" items="${emp}">
	<tr><td style="text-align:center"> ${employees.id} </td>
	<td>${employees.employeeId} </td>
	<td>${employees.firstName} </td>
	<td>${employees.lastName}</td>
	<td>${employees.gender}</td>
	<td>${employees.dateOfBirth}</td>
	<td>${employees.phoneNumber}</td>
	<td>${employees.email}</td>
	<td>${employees.address}</td>
	<td>${employees.jobTitle}</td>
	<td>${employees.joiningDate}</td>
	
	<td><a href="delete?id=${employees.id}">
	<input style="background-color:mistyrose; color:darkred" type="submit" value="Delete">
	</a></td>
	<td><a href="update?id=${employees.id}">
	<input style="background-color:lightcyan; color:darblue" type="submit" value="Update">
	</a></td>
	</tr>
	</c:forEach>
	</table>


</body>
</html>