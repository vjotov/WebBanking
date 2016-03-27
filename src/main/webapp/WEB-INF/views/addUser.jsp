<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Regiter</title>
</head>
<body>

<ct:header title="User Registry" />

	<form:form method="POST" action="${contextPath}${saveUrl}" modelAttribute="user">
		<table>
			<tr>
				<td><form:label path="id">UserID</form:label></td>
				<td><form:input path="id" /><td>
			</tr>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /><td>
			</tr>
			<tr>
				<td><form:label path="account">Account</form:label></td>
				<td><form:input path="account" /><td>
			</tr>
		</table>
		<input type=submit id="btn1" name="Submit"/>
		
	</form:form>


<ct:footer />
</body>
</html>