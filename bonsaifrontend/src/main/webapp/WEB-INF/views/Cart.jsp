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
<c:set val=${pageContext.request.contextParam} var="cantext"/>
<table align="center" border="1">

		<tr>
			 
			
			
			
			
						
		
			<td><img src="${proImages}${product.pname}.jpg" width="250px"
					height="250px"></td>
	<td>Product ID</td>	<td>	${product.pid}</td>
			<td>Product Name</td>	<td>${product.pname}</td>
				
			<td>Quantity</td>	<td><input type="number" name="quantity"/></td>
				
				<a href="${context}/adcart">addtocart</a>
				</td>
			</tr>
		
	</table>
</body>
</html>