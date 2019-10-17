<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/prductInfoProcess.htm" method="post" modelAttribute="product">
<table width="80%">
<tr>
<td>Product Name</td>
<td> : </td>
<td><form:input path="productName"/><form:errors path="productName"/></td>
</tr>
<tr>
<td>Type</td>
<td> : </td>
<td><form:input path="type"/><form:errors path="type"/></td>
</tr>
<tr>
<td>Manufacturer</td>
<td> : </td>
<td><form:select path="manufacturer">
<form:option value="">--Select--</form:option>
<form:option value="reliance">Reliance</form:option>
<form:option value="gov.">Government</form:option>
</form:select><form:errors path="manufacturer"/></td>
</tr>
<tr>
<td>Price</td>
<td> : </td>
<td><form:input path="price"/><form:errors path="price"/></td>
</tr>
</table>
<input type="submit" value="Register">
</form:form>
</body>
</html>