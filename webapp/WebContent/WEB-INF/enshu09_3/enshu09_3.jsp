<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--@elvariable id="employees" type="servlet.enshu09_3.Employee"--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>演習 9.3 EL式とJSTLの利用</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>従業員番号</th>
        <th>従業員名</th>
        <th>部署名</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td><c:out value="${employee.empId}"/></td>
            <td><c:out value="${employee.empName}"/></td>
            <td><c:out value="${employee.deptName}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
