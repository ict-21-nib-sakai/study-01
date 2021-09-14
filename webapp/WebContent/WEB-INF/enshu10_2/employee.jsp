<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--@elvariable id="employees" type="java.util.List<servlet.enshu10_1.data.Employee>"--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Webアプリケーション開発 演習問題 演習 10.2</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>従業員番号</th>
        <th>従業員名</th>
        <th>部署名</th>
        <th>登録日時</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td><c:out value="${employee.empId}"/></td>
            <td><c:out value="${employee.name}"/></td>
            <td><c:out value="${employee.department.deptName}"/></td>
            <td><c:out value="${employee.registeredDate}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
