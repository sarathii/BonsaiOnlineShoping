<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<%@ include file="Head.jsp" %>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width initial-scale=1">
</head>
<body>
<c:url value="/resources/images/products/" var="proImages" />
<table>
	<tr >
			<td>productid</td>
			<td>product Name</td>
			<td>cart id</td>
			
			<td>price</td>
		</tr>
		<c:forEach items="${list}" var="cart">
			<tr >
				<td>${cart.pid}</td>
				<td>${cart.pname}</td>
				
				<!--  <td>${cart.price }*{cart.quantity }</td>-->
				<td><a href="<c:url value="delete/${cart.pid}"/>">delete</a>
				</td>
				

</tr></c:forEach>
</table>
</body>
</html>