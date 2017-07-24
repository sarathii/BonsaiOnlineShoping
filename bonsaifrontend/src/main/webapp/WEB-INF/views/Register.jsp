<%@ page language="java" contentType="text/html"%>

<html>
<head>
<%@ include file="Head.jsp" %>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
	
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width initial-scale=1">

<title>registration form</title>
</head>
<body>
</br>
</br>
	<form action=reg method=post>
		<div class="container">
			<div class="jumbotron">
				<div class="form-group">
					
						USERNAME:<input
						type="text" class="form-control" name="username"
						placeholder="enter username" required="required"> 
						
						ADDRESS<input type="text" class="form-control" name="adrs" required="required"/>
	
						PASSWORD:<input type="password" class="form-control" name="password" placeholder="enter password" required="required">
					
						<input type="hidden" class="form-control" name="role" value="ROLE_USER" >
						<input type="hidden" class="form-control" name="enable" value="False" >
						<input type="submit" value="submit" class=center-block> already Registered?click here to <a href="login">login
					</a>
				</div>
			</div>
		</div>
	</form>

</body>
</html>