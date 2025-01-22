<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Menu.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
    <h2>Please Enter Employee Details</h2>
	<form action="saveEmployee" method="post">
	<table border=1>	
	<tr><td>Employee ID</td><td><input type="text" name="employeeId"/></td></tr>
	<tr><td>First Name</td><td><input type="text" name="firstName"/></td></tr>
	<tr><td>Last Name</td><td><input type="text" name="lastName"/></td></tr>
	<tr>
    <td>Gender</td>
    <td>
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female
    </td>
    </tr>
	<tr><td>DOB</td><td><input type="date" name="dateOfBirth"/></td></tr>
	<tr><td>Phone Number</td><td><input type="text" name="phoneNumber"/></td></tr>
	<tr><td>Email</td><td><input type="email" name="email"/></td></tr>
	<tr><td>Address</td><td><input type="text" name="address"/></td></tr>
	<tr><td>Job Title</td><td><input type="text" name="jobTitle"/></td></tr>
	<tr><td>Joining Date</td><td><input type="date" name="joiningDate"/></td></tr>
	<tr></tr>
	<tr><td style="text-align:center" colspan="2"><input type="submit" value="Save Employee"/></td></tr>	
	</table>
	</form>
	${msg}
</body>
</html>