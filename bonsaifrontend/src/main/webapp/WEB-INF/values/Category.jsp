<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>category</title>
</head>
<body>
	<form action="addcategory" method="post">
		<div class="container">
			<div class="jumbotron">


				<div class="form-group">


					category name:<input type="text" class="form-control"
						placeholder="enter category name" id="catname" required="required" /><br />

					category description:<input type="text" class="form-control"
						placeholder="enter description" id="catdscrptn"
						required="required" /><br /> <input type="submit"
						value="addc">




				</div>
			</div>
			<div class="jumbotron"></div>
		</div>
	</form>
</body>
</html>