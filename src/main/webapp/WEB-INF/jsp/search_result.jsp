<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search result</title>
</head>
<body>
<h2>lead|searchresult</h2>
<table>
<tr>
<th> first name</th>
<th> last name</th>
<th> email</th>
<th> mobile</th>
<th> delete</th>
<th> update</th>
</tr>
<c:forEach items = "${Leads}" var="Lead">
<tr>
<td>${Lead.firstName}</td>
<td>${Lead.lastName}</td>
<td>${Lead.email}</td>
<td>${Lead.mobile}</td>
<td><a href="delete?id=${Lead.id}"> delete</a></td>
<td><a href="update?id=${Lead.id}"> update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>