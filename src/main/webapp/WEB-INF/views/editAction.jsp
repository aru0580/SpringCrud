<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/index.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style type="text/css">
.green{
	background:	#00FA9A;
	width:450px;
}
</style>
</head>
<body><center>
	<div class="box green"><br>
	<h3><font color="red">Please Add Product Details</font></h3><br>
	<form:form action="admin/editAction" commandName="product" method="post">
		<table align="center">
			<tr>
				<td>Product ID :</td>
				<td><form:input path="productId"
						value="${product.productId}" readonly="true"/></td>
			</tr>
			<tr>
				<td><br>Product Name :</td>
				<td><br><form:input path="productName"
						value="${product.productName}" /></td>
			</tr>
			<tr>
				<td><br>Product Category:</td>
				<td><br><form:input path="productCategory"
						value="${product.productCategory}" /></td>
			</tr>
			<tr>
				<td><br>Product Description:</td>
				<td><br><form:input path="productDescription"
						value="${product.productDescription}" /></td>
			</tr>
			<tr>
				<td><br>Product Price:</td>
				<td><br><form:input path="productPrice"
						value="${product.productPrice}" /></td>
			</tr>
			<tr>
				<td><br>Product Condition:</td>
				<td><br><form:input path="productCondition"
						value="${product.productCondition}" /></td>
			</tr>
			<tr>
				<td><br>Product Status:</td>
				<td><br><form:input path="productStatus"
						value="${product.productStatus}" /></td>
			</tr>
			<tr>
				<td><br>Unit In Stock:</td>
				<td><br><form:input path="UnitInStock"
						value="${product.unitInStock}" /></td>
			</tr>
			<tr>
				<td><br>Product Manufacturer:</td>
				<td><br><form:input path="productManufacturer"
						value="${product.productManufacturer}" readonly="true"/></td>
			</tr>
			<tr>
				<td><br></td>
				<td><br><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form:form>
</div></center></body>
</html>