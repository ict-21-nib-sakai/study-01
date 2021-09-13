<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<table border="1">
    <tr>
        <th>商品ID</th>
        <th>商品名</th>
        <th>価格</th>
        <th>詳細</th>
    </tr>
    <%--@elvariable id="itemList" type="java.util.List<com.ecsite.data.Item>"--%>
    <c:forEach var="item" items="${itemList}">
        <tr>
            <td><c:out value="${item.itemId}"/></td>
            <td><c:out value="${item.name}"/></td>
            <td><c:out value="${item.price}"/></td>
            <td>
                <a href="/?????/itemDetail?id=<c:out value='${item.itemId}'/>"><c:out value="${item.itemId}"/></a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
