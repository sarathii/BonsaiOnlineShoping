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
</br>
</br>
</br>
<c:url value="/resources/images/products/" var="proImages" />

		<c:forEach items="${prodlist}" var="product">
			
				<div ><img src="${proImages}${product.pname}.jpg" width="250px"
					height="250px"></div>
				<div>product id: ${product.pid}</div>
				<div>product name: ${product.pname}</div>
				<div >price : ${product.price}</div>
				<div><a href="<c:url value="productdscrptn/${product.pid}"/>">view</a>
				</div>
			<hr>
		</c:forEach>
	</table>
</body>
</html>