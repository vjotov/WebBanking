<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Regiter</title>
</head>
<body>

<ct:header title="User Registry" />

<button type="button" onclick="location = '${contextPath}${addUserUrl}'">Add User</button>

	<table border="1">
		<thead>
			<tr>
				<th>User Id</th>
				<th>User Name</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<c:if test="${not empty users}">
	    	<tbody>
		        <c:forEach var="u" items="${users}">
		            <tr>
		                <td>${u.id}</td>
		                <td>${u.name}</td>
		                <td>	
		                	<c:url var="viewAccount" value="${accountUrl}${u.id}" />
		                		
		                	<a href="${viewAccount}">Account</a>
						</td>
		            </tr>
		        </c:forEach>
	        </tbody>
		</c:if>
	</table>

<ct:footer />
</body>
</html>
