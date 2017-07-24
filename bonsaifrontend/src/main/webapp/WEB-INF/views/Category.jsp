<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<html>
<head>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width initial-scale=1">
</head>
<body>

	<!-- Category Form Started -->
	<c:if test="${flag}">
		<form action="UpdateCategory" method="post">
	</c:if>
	<c:if test="${!flag}">
		<form action="AddCategory" method="post">
	</c:if>
	<div class="container">
		<div class="jumbotron">
			<div class=container>
				<table align="center" cellspacing="2">
					<tr>
						<td colspan="2">Category Details</td>
						<c:if test="${flag}">
							<input type="hidden" name="catid" value="${category.catid}" />
						</c:if>
						
					</tr>
					<tr>
						<td>Category Name</td>
						<c:if test="${flag}">
							<td><input type="text" name="catname"
								value="${category.catname}" /></td>
						</c:if>
						<c:if test="${!flag}">
							<td><input type="text" name="catname" /></td>
						</c:if>
					</tr>
					<tr>
						<td>Category Description</td>
						<c:if test="${flag}">
							<td><input type="text" name="catdscrptn"
								value="${category.catdscrptn}" /></td>
						</c:if>
						<c:if test="${!flag}">
							<td><input type="text" name="catdscrptn" /></td>
						</c:if>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="AddCategory" /></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	</form>


	<!-- Category Form Completed -->

	<!-- Displaying the Category data using Table -->
	<table cellspacing="2" align="center" border="1">

		<tr >
			<td>Category ID</td>
			<td>Category Name</td>
			<td>Category Desc</td>
			<td>Operation</td>
		</tr>
		<c:forEach items="${catdetail}" var="category">
			<tr >
				<td>${category.catid}</td>
				<td>${category.catname}</td>
				<td>${category.catdscrptn}</td>
				<td><a href="<c:url value="deleteCategory/${category.catid}"/>">Delete</a>
					<a href="<c:url value="updateCategory/${category.catid}"/>">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	

</body>
</html>
















