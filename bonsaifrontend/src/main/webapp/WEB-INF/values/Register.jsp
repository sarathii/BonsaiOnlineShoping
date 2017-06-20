<%@ page language="java" contentType="text/html"%>

<html>
<head>

<link href="bootstrap/css/bootstrap.css.min" rel="stylesheet">
<meta name="viewport" content="width=device-width initia-sclae=1">
<%@ include file="Head.jsp"%>
<title>registration form</title>
</head>
<body>

	<form>
		<div class="container">
			<div class="jumbotron">
				<div class="form-group">
					NAME:<input type="text" class="form-control" id=Rname
						placeholder="enter name" required="required"> USERID:<input
						type="email" class="form-control" id="Rid"
						placeholder="enter email" required="required"> PASSWORD:<input
						type="password" class="form-control" id="Rpswrd"
						placeholder="enter password" required="required">
					CONFIRMATION PASSWORD:<input type="password" class="form-control"
						id="Rcnfrm" placeholder="enter ur password for confirmation"
						required="required"> <input type="submit" value="submit"
						class=center-block> already user<a href="login.jsp">login
					</a>
				</div>
			</div>
		</div>
	</form>

</body>
</html>