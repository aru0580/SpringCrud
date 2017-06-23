<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/views/index.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style type="text/css">
.green{
	background:	#00FA9A;
	width:400px;
}
</style>
</head>
<body><center> <div class="box green"><br>
<h4><font color="red">please fill the details</font></h4><br>
 <form:form action="register" commandName="customer" method="post">
   <table >
		<tr>
			<td>Customer Name:</td>
			<td><form:input path="customerName" /></td>
		</tr>
		<tr>
			<td><br>Customer Email:</td>
			<td><br><form:input path="customerEmail" /></td>
		</tr>	
		<tr>
			<td><br>Customer Phone:</td>
			<td><br><form:input path="customerPhone" /></td>
		</tr>
		<tr>
			<td><br>Customer UserName:</td>
			<td><br><form:input path="username" /></td>
		</tr>
		<tr>
			<td><br>Customer Password:</td>
			<td><br><form:input path="password" /></td>
		</tr>
		<tr>
			<td><br></td>
			<td><br><input type="submit" value="Register" /><br></td>
		</tr>
	</table>
  </form:form> 
 </div></center></body>
</html>