<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Registration Page</title>
</head>
<body>

<form:form modelAttribute="student" action="registerStudent" method="POST">
<table>
    <tr>
        <td>User Name :</td>
        <td><form:input path="username" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
        <td>First Name :</td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td>Last Name :</td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
        <td>Email ID :</td>
        <td><form:input path="emailId" /></td>
    </tr>
    <tr>
        <td></td>
        <td>
           <form:button name="register">Register</form:button>
        </td>
    </tr>
        <tr>
        <td></td>
        <td>
           <a href="Home.jsp">Home</a>
        </td>
    </tr>
</table>
</form:form>
</body>
</html>