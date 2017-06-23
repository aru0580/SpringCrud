<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="/WEB-INF/views/index.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style type="text/css">
.green{
	background:	#00FA9A;
	width:1200px;
}
</style>
</head>
<body><center><div class="box green">
  <c:if test="${!empty products}">
 <br> <h3><font color="red">List of Products</font></h3>
 <table border="1" style="background-color:lightblue">
  <tr>
   <th>ProductId</th>
   <th>ProductName</th>
   <th>ProductCategory</th>
   <th>ProductDescription</th>
   <th>ProductPrice</th>
   <th>ProductCondition</th>
   <th>ProductStatus</th>
   <th>UnitInStock</th>
   <th>ProductManufacturer</th>
  </tr>

  <c:forEach items="${products}" var="product">
   <tr>
    <td><c:out value="${product.productId}"></c:out></td>
    <td><c:out value="${product.productName}"></c:out></td>
    <td><c:out value="${product.productCategory}"></c:out></td>
    <td><c:out value="${product.productDescription}"></c:out></td>
    <td><c:out value="${product.productPrice}"></c:out></td>
    <td><c:out value="${product.productCondition}"></c:out></td>
    <td><c:out value="${product.productStatus}"></c:out></td>
    <td><c:out value="${product.unitInStock}"></c:out></td>
    <td><c:out value="${product.productManufacturer}"/></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
<br>
</div></center>
</body>
</html>