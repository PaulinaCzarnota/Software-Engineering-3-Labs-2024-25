<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User List</title>
</head>
<body>
    <h2>List of all Users</h2>
    
    <!-- Display a table of all users retrieved from the controller -->
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Password</th>
        </tr>
        <c:forEach var="user" items="${allUsers}">
            <tr>
                <td><c:out value="${user.id}" /></td>
                <td><c:out value="${user.username}" /></td>
                <td><c:out value="${user.firstName}" /></td>
                <td><c:out value="${user.lastName}" /></td>
                <td><c:out value="${user.password}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>