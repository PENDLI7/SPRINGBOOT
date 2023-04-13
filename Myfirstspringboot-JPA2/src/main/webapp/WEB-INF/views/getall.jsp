 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View List</title>  
</head>  
<body>  
  

  
<h1>Employees List</h1>  
  


<table border="1" width="90%">  
<tr><th>Id</th><th>Name</th><th>Designation</th><th>Experinece</th>  
<th>Department</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${map}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getDesignation()}</td>  
<td>${u.getExp()}</td><td>${u.getDept()}</td>  
<td><a href="/edit?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="/get">Add New Employee</a>  
  
</body>  
</html>  