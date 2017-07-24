<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<%@ include file="Product.jsp"%>
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

	<c:set var="context" value="${pageContext.request.contextPath}" />

	<form:form method="POST" action="${context}/insert"
		modelAttribute="product" enctype="multipart/form-data">

		<div class="form-group">
			Product Name:
			<form:input path="pname" placeholder="enter product name"
				class="form-control" />
			Product Id:
			<form:input path="pid" placeholder="enter productid"
				class="form-control" />
			Price:
			<form:input path="price" placeholder="enter price"
				class="form-control" />
			Supplier Id:
			<form:input path="supid" placeholder="enter supplier"
				class="form-control" />

			Category name:
			<form:select path="catid" class="form-control">
				<form:option value="0" label="choose" />
				<form:options items="${catlist}" />
			</form:select>

			Stock:
			<form:input path="quantity" placeholder="enter quantity"
				class="form-control" />
			Product Description:
			<form:input path="pdscrptn" type="text" class="form-control"
				placeholder="enter productdescription" />

			Image Upload :
			<form:input type="file" class="form-control input-sm" width="300px"
				path="pimage" placeholder="File upload" />
			<input type="submit" value="insert">

		</div>
		<hr>
		</div>

	</form:form>




	<div class="container">

		<c:forEach items="${prodlist}" var="product">
			<div>
				<img src="${proImages}${product.pname}.jpg" width="250px"
					height="250px">
			</div>
			<div>product id: ${product.pid}</div>
			<div>product name: ${product.pname}</div>
			<div>price: ${product.price}</div>
			<div>quantity: ${product.quantity}</div>
			<div>catid: ${product.catid}</div>
			<div>supplier id: ${product.supid}</div>
			<div>
				<a href="${context}/deleteProduct/${product.pid}">Delete</a> <a
					href="<c:url value="updateProduct/${product.pid}"/>">Update</a>
			</div>
			<hr>
		</c:forEach>
	</div>
</body>
</html>