<%@ page language="java" contentType="text/html"%>

<html>
<head>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width initial-scale=1">

<title>category</title>
</head>
<body>
	<form action="addcategory" method="post">
		<div class="container">
			<div class="jumbotron">


				<table>
					<tr>
						<td>categoryid:</td>
						<td><input type:"hi" id="catid"></td>
					</tr>
					<tr>
						<td>category name:</td>
						<td><input type="text" placeholder="enter category name"
							id="catname" required="required" /></td>
					</tr>
					<tr>
						<td>category description:</td>
						<td><input type="text" class="form-control"
							placeholder="enter description" id="catdscrptn"
							required="required" /></td>
					</tr>
					<tr>
						<td ><input type="submit" value="add"></td>
					</tr>



				</table>
			</div>
		</div>
		<div class="jumbotron"></div>
		</div>
	</form>
</body>
</html>