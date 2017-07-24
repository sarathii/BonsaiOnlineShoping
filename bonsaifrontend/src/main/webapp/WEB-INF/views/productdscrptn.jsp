<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<%@ include file="Head.jsp"%>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width initial-scale=1">
</head>
<body>
	</br>
	</br>
	<c:url value="/resources/images/products/" var="proImages" />
	<c:set var="context" value="${pageContext.request.contextPath}" />
	<div class="container">
		<div class=row>
			<img src="${proImages}${product.pname}.jpg" width="250px"
				height="250px">
		</div>


	
	<div>Product ID: ${product.pid}</div>
	
	<div>Product Name: ${product.pname}</div>


	<div>	Quantity:<input type="number" name="quantity" /></div>
	<div><a href="${context}/adcart">addtocart</a></div>
	</div>
</body>
</html>