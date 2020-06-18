<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>viewItem</title>
	<link rel="stylesheet" type="text/css" href="content.css">
</head>
<body>
	<h3>Viewing To-do Item</h3>

	<form action="FormController" method="POST">
	    <table>
	        <tr>
	            <td width="32">Subject: </td>
	            <td>${item.subject}</td>
	        </tr>
	        <tr>
	            <td>Content: </td>
	            <td>${item.content}</td>
	        </tr>
	    </table>
		<br>		
		<input type="hidden" name="id" value="${item.id}"> 
	    <input type="submit" name="deleteItem" value="Delete Item"><br>
	</form>	
	
	<br><br><a href="ListController">Return to To-do Items</a>	
</body>
</html>