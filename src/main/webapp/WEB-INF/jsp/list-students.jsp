<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>
	<title>List Students</title>
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Student Management System</h2>
		</div>
	</div>
	<div id="Container">
		<div id="content">
			
			<!-- put new button : Add Student -->
			<input type="button" value="Add Student"
				onclick="window.location.href='showFormForAdd'; return false;" />
	
			<!-- add out html table here -->
			<table>
				<tr>
					<th>Student ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Course</th>
					<th>Country</th>
					<th>Action</th>
				</tr>

				<!-- loop over and print the students -->
				<c:forEach var="tempStudent" items="${students}">
				
				<!-- construct an update link with student id -->
				<c:url var="updateLink" value="/student/showFormForUpdate">
					<c:param name="studentId" value = "${tempStudent.id}"/>
				</c:url>
				
				<!-- construct a delete link with student id -->
				<c:url var="deleteLink" value="/student/delete">
					<c:param name="studentId" value = "${tempStudent.id}"/>
				</c:url>
			
					<tr>
						<td>${tempStudent.id}</td>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.course}</td>
						<td>${tempStudent.country}</td>
						<td>
						 	<a href="${updateLink}">Update</a>
						 	|
							<a href="${deleteLink}"
							onclick = "if(!(confirm('Are you sure you want to delete this student?')))return false">Delete</a>
							
						</td>
					</tr>
				</c:forEach>
			</table>
			
			<hr>
			
			<!-- put new button : Logout -->
			<a href="" onclick="window.location.href='logout'; return false;">Logout</a>
			
		</div>
	</div>
</body>
</html>