
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<body style="background-color: #D2D0CE">
	<br />
	<br />
	<br />
	<br />
	<br />
	<div class="container">


		<h1 style="text-align: center; color: #0000FF">BONSAI ONLINE
			SHOPPING</h1>
		<br />
	</div>
	<c:url value="/resources/images/products/" var="proImages" />
	<div id="caro" class="carousel slide " data-ride="carousel ">

		<ol class="carousel-indicators">
			<li data-target="#caro" data-slide-to="0" class="active"></li>
			<li data-target="#caro" data-slide-to="1"></li>
			<li data-target="#caro" data-slide-to="2"></li>
		</ol>


		<div class="carousel-inner">
			<div class="item active ">
				<img src="${proImages}maple.jpg" style="width: 100%; height: 500px;"
					class="img-responsive">
			</div>

			<div class="item">
				<img src="${proImages}sakuraflower.jpg"
					style="width: 100%; height: 500px;" class="img-responsive">
			</div>

			<div class="item img-responsive">
				<img src="${proImages}shimaficus.jpg"
					style="width: 100%; height: 500px;">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#caro" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#caro" data-slide="next">
			<span class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<div class="jumbotron">
		<div class="row">
			<div class="col-sm-4">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (14).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>

			</div>
			<div class="col-sm-4">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (8).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>

			</div>
			<div class="col-sm-4 ">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (9).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>
		</div>
		</br> </br>

		<div class="row">
			<div class="col-sm-3  col-md-4 img-responsive">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (1).jpg"  class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>
			<div class="col-sm-3 col-md-4 img-responsive">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (4).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>
			<div class="col-sm-3 col-md-4 img-responsive">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (7).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>

		</div>
		<div class="row">
			<div class="col-sm-3 col-md-4  img-responsive">
				<a href="login" class="img-thumbnail img-responsive "
					style="width: 250px; height: 250px"> <img
					src="${proImages}th (3).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>
			<div class="col-sm-3 col-md-4  img-responsive">
				<a href="login" class=" img-responsive "
					> <img
					src="${proImages}th (5).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>
			<div class="col-sm-3 col-md-4  img-responsive">
				<a href="login" class="img-thumbnail img-responsive "
					> <img
					src="${proImages}th (3).jpg" class="img-responsive img-thumbnail" style="width: 250px; height: 250px"></a>
			</div>

		</div>
	</div>


</body>
</html>