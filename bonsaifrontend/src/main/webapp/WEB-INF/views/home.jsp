
<%@ page language="java" contentType="text/html"%>
<%@ include file="Head.jsp"%>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">


<meta name="viewport" content="width=device-width initial-scale=1">

<body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
			<div id="caro" class="carousel slide " data-ride="carousel ">
				
				<ol class="carousel-indicators">
					<li data-target="#caro" data-slide-to="0" class="active"></li>
					<li data-target="#caro" data-slide-to="1"></li>
					<li data-target="#caro" data-slide-to="2"></li>
				</ol>


				<div class="carousel-inner">
					<div class="item active ">
						<img src="images/maple.jpg" style="width:100%; height:500px;" class="img-responsive">
					</div>

					<div class="item">
						<img src="images/pri.jpg"  style="width:100%; height:500px;" class="img-responsive">
					</div>

					<div class="item img-responsive">
						<img src="images/maple.jpg" style="width:100%; height:500px;">
					</div>
				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#caro" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#caro" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>	

</body>
</html>