<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Head.jsp" %>
<html>
<head>


</head>
<body>


<form ><div class="container">
<div class="form-group">
productname:<input type="text" id="pname" placeholder="enter product name"class="form-control">
productid:<input type="number" id="pid" placeholder="enter productid"class="form-control">
price:<input type="number" id="price" placeholder="enter price"class="form-control">
supplierId:<input type="name" id="supid" placeholder="enter supplier id"class="form-control">
categoryid:<input type="number" id="cid" placeholder="enter category id"class="form-control">
Quantity:<input type="number" id="qnty" placeholder="enter quantity"class="form-control">
productdescription<input type="text" class="form-control" id="pdscrptn" placeholder="enter productdescription">
</div>
</div>
</form>
</body>
</html>