<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>displayAllItems</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="content.css">
</head>
<body>
	<h3>To-do List</h3>

 	<table class="todolist">
		<tr>
			<th width="20">#</th>
			<th>Subject</th>
		</tr>
 	
		<c:forEach var="emp" items="${employeeList}">			
		<tr>
			<td><a href="ViewController?id=${emp.id}">${emp.id}</a></td>
			<td>${emp.subject}</td>
		</tr>
		</c:forEach>
	</table>
	
	<h3>Add a To-do Item</h3>
	
	<form action="FormController" method="POST">
	    <table>
	        <tr>
	            <td width="32">Subject: </td>
	            <td><input type="text" name="subject" size="140"></td>
	        </tr>
	        <tr>
	            <td>Content: </td>
	            <td><input type="text" name="content" size="140"></td>
	        </tr>	        		                   
	    </table>
	    <br>
	    <input type="submit" name="addItem" value="Add Item">
	</form>
		
	
</body>
</html>