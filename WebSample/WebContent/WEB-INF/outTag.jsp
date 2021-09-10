<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:outタグで出力</title>
</head>
<body>
    <h1>c:outタグで出力</h1>
    <p>
        <c:out value="${key}" default="0" />
        <br>
        <c:out value="${input}" default="0" />
    <br>
    </p>
</body>
</html>
