<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update Employee </title>
</head>
<body>
	<form action="updateEmployee" method="post">
	<table border=1>
	<tr>
	<td style="text-align:center" colspan="2" bgcolor="lightgrey">
	<input type="hidden" name="id" value="${employeeUpd.id}"><font size="4"> UPDATE THE EMPLOYEE DETAILS
	</font></td>
	</tr>
	<tr>
	<td>Employee ID</td>
	<td><input type="text" name="employeeId" value="${employeeUpd.employeeId}" readonly/></td>
	</tr>
	<tr>
	<td>First Name</td>
	<td><input type="text" name="firstName" value="${employeeUpd.firstName}"/></td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="lastName" value="${employeeUpd.lastName}"/></td>
	</tr>
	<tr>
    <td>Gender</td>
    <td>
        <input type="radio" name="gender" value="Male" ${employeeUpd.gender == 'Male' ? 'checked' : ''}> Male
        <input type="radio" name="gender" value="Female" ${employeeUpd.gender == 'Female' ? 'checked' : ''}> Female
    </td>
    </tr>
	<tr>
	<td>DOB</td>
	<td><input type="date" name="dateOfBirth" value="${employeeUpd.dateOfBirth}"/></td>
	</tr>
	<tr>
	<td>Phone Number</td>
	<td><input type="text" name="phoneNumber" value="${employeeUpd.phoneNumber}"/></td>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="email" value="${employeeUpd.email}"/></td>
	</tr>
	<tr>
	<td>Address</td>
	<td><input type="text" name="address" value="${employeeUpd.address}"/></td>
	</tr>
	<tr>
	<td>Job Title</td>
	<td><input type="text" name="jobTitle" value="${employeeUpd.jobTitle}"/></td>
	</tr>
	<tr>
	<td>Joining Date</td>
	<td><input type="date" name="joiningDate" value="${employeeUpd.joiningDate}"/></td>
	</tr>
	<tr>
	<td style="text-align:center" colspan="2"><input type="submit" value="Update"/></td>
	</tr>
	</table>
	</form>
</body>
</html>

