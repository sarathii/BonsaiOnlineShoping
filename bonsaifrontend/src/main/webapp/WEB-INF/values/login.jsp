<%@ page language="java" contentType="text/html"%>
<%@ include file="Head.jsp"%>
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<meta name="viewport" content="width=device-width initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>login</title>
</head>
<body>


	<form>
		<div class="container">
			<div class="jumbotron">
				

				<div class="form-group">


					USERID:<input type="email" class="form-control"
						placeholder="enter email" id="name" required="required" /><br />

					PASSWORD:<input type="password" class="form-control"
						placeholder="enter password" id="pswrd" required="required" /><br />
<div style="text-align:left">  newuser:<a href="Register.jsp">sign up</a>
				
						<input type="submit" value="login" >
					
					
			 <input type="button"  value="cancel" id="cncl" style="background-color:red">
				
				</div>
			</div>
			<div class="jumbotron">
				
			</div>
		</div>
	</form>
</body>
</html>