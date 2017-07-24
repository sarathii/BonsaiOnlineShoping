<%@ page language="java" contentType="text/html"%>


<html>
<head>
<%@ include file="Head.jsp" %>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
	
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width initial-scale=1">
</head>
<body>
</br>
</br>
</br>
</br>
<div class="container">
<div class="jumbotron">
<form action="perform_login" method="post">

	
	
		<div class="form-group">
				Userid:<input type="text" name="username" placeholder="enter user name"class="form-control"></td>
			
				Password:<input type="password" name="password" placeholder="enter password" class="form-control"></td>
			
			<input type="submit" value="login" class="center-block">dont have an account yet?click here to <a href="Register">register
					</a>
			</div>
		
	</form>
	</div>
	</div>
</body>
</html>
