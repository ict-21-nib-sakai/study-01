<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="collabo.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>転送成功</p>

	<%
	Employee employee = (Employee) request.getAttribute("emp_key");
	%>

	<p>従業員ID: <%= employee.getEmp_id() %></p>
	<p>従業員ID: <%= employee.getEmp_name() %></p>
</body>
</html>