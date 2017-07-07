<%@ page language="java" contentType="text/html"%>

<html>
<head>

<link href="bootstrap/css/bootstrap.css.min" rel="stylesheet">
<meta name="viewport" content="width=device-width initial-scale=1">
<%@ include file="Head.jsp"%>
<title>registration form</title>
</head>
<body>

	<form>
		<div class="container">
			<div class="jumbotron">
				<div class="form-group">
					NAME:<input type="text" class="form-control" id=Rname
						placeholder="enter name" required="required"> 
						USERID:<input
						type="email" class="form-control" id="Rid"
						placeholder="enter email" required="required"> 
						<div class="col-sm-6">
						address<input type="text" class="form-control" id="adrs" required="required"/>
						DateOfBirth:<input type="date" required="required" id="dob" placeholder="enter DOB"></div><div class="col-sm-6"></div>
						Phonenumber:<input type="phoneno" id="phone" required="required"placeholder="enter phoneno"></div>
						PASSWORD:<input
						type="password" class="form-control" id="Rpswrd"
						placeholder="enter password" required="required">
					CONFIRMATION PASSWORD:<input type="password" class="form-control"
						id="Rcnfrm" placeholder="enter ur password for confirmation"
						required="required"> <input type="submit" value="submit"
						class=center-block> already Registered?click here to <a href="login.jsp">login
					</a>
				</div>
			</div>
		</div>
	</form>

</body>
</html>