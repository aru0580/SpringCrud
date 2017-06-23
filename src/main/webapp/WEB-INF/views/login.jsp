<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/views/index.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style type="text/css">
.green {
	background: #00FA9A;
	width: 300px;
}
</style>
</head>
<body>
	<center>
		<div class="box green">
			<br>
			<h3>
				<font color="red">Please Login Here!!!</font>
			</h3>
			<br>
			<form name='f' action="<c:url value='j_spring_security_check' />"
				method='POST'>
				
				<c:if test="${not empty error}">
					<div class="error" style="color: #ff0000;">${error}</div>
				</c:if>
				<table>
					<tr>
						<td><br>User Name:</td>
						<td><br> <input type='text' name='username'></td>
					</tr>
					<tr>
						<td><br>Password:</td>
						<td><br> <input type='password' name='password' /></td>
					</tr>
					<tr>
						<td align="center"><br>&emsp;&emsp;&emsp;<input
							name="submit" type="submit" value="Login" /></td>
						<td align="center"><br> <input name="reset" type="reset" />&emsp;</td>
				</table>

			</form>
		</div>
	</center>
</body>
</html>