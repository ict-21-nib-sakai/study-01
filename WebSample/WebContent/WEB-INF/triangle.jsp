<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出力用JSP</title>
</head>
<body>
    <h1>サーブレットからのデータの受け取ります</h1>
    <p>${triangle.base}</p>
    <p>${triangle.height}</p>

    <h1>三角形の情報 (c:forEach)</h1>
    <c:forEach var="triangle" items="${triangles}">
        <c:out value="${triangle.base}"></c:out>
        <br>
    </c:forEach>

    <h1>変数 score の判定 (c:if)</h1>
    <%--@elvariable id="score" type=""--%>
    <c:if test="${score >= 90}">
        <p>90点以上です！</p>
    </c:if>
    <p>あなたの点数： <c:out value="${score}"></c:out></p>
</body>
</html>
