<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/views/home.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<body> <center><div class="box green"><br>
<h3><font color="red">Please Add Product Details</font></h3><br>
 <form:form action="product/add" commandName="product" method="post">
   <table align="center" >
		<tr>
			<td>Product Name :</td>
			<td><form:input path="productName" /></td>
		</tr>
		<tr>
			<td><br>Product Category:</td>
			<td><br><form:input path="productCategory" /></td>
		</tr>	
		<tr>
			<td><br>Product Description:</td>
			<td><br><form:input path="productDescription" /></td>
		</tr>
		<tr>
			<td><br>Product Price:</td>
			<td><br><form:input path="productPrice" /></td>
		</tr>
		<tr>
			<td><br>Product Condition:</td>
			<td><br><form:input path="productCondition" /></td>
		</tr>
		<tr>
			<td><br>Product Status:</td>
			<td><br><form:input path="productStatus" /></td>
		</tr>
		<tr>
			<td><br>Unit In Stock:</td>
			<td><br><form:input path="UnitInStock" /></td>
		</tr>
		<tr>
			<td><br>Product Manufacturer:</td>
			<td><br><form:input path="productManufacturer" /></td>
		</tr>		
		<tr>
			<td></td>
			<td><br><input type="submit" value="Add Products" /><br></td>
		</tr>
	</table>
  </form:form> 
<br></div></center></body>
</html>