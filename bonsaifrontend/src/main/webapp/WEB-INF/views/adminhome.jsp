<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
	
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width initial-scale=1">
</head>
<body>


<form:form action="insert"  modelAttribute="product">

<div class="form-group">
productname:<form:input  path="pname" placeholder="enter product name" class="form-control"/>
productid:<form:input path="pid" placeholder="enter productid" class="form-control"/>
price:<form:input path="price" placeholder="enter price" class="form-control"/>
supplierId:<form:input path="supid" placeholder="enter supplier id" class="form-control"/>
categoryid:<form:select path="catid">
						<form:option value="0" label="------Select----" />
						<form:options items="${catlist}" />
					</form:select>

Stock:<form:input path="quantity" placeholder="enter quantity" class="form-control"/>
productdescription<form:input type="text" class="form-control" path="pdscrptn" placeholder="enter productdescription"/>
<input type="submit" value="insert">
</div>

</form:form>
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Price</td>
		<td>Quantity</td>
		<td>Category Id</td>
		<td>Supplier Id</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${prodlist}" var="product">
		<tr bgcolor="cyan">
			<td>${product.pid}</td>
			<td>${product.pname}</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.catid}</td>
			<td>${product.supid}</td>
			<td><a href="<c:url value="deleteProduct/${product.pid}"/>">Delete</a>
				<a href="<c:url value="updateProduct/${product.pid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>