<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View User Profile</title>
</head>
<body>
    <!-- Display the logged-in user's profile information -->
    <c:set var="user" value="${sessionScope.user}" />
    <h2>View Profile For: <c:out value="${user.username}" /></h2>
    <table>
        <tr>
            <td>ID: <c:out value="${user.id}" /></td>
        </tr>
        <tr>
            <td>First Name: <c:out value="${user.firstName}" /></td>
        </tr>
        <tr>
            <td>Last Name: <c:out value="${user.lastName}" /></td>
        </tr>
        <tr>
            <td>Password: <c:out value="${user.password}" /></td>
        </tr>
    </table>
</body>
</html>