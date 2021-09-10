<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--@elvariable id="value1" type="Integer"--%>
<%--@elvariable id="operator" type="String"--%>
<%--@elvariable id="value2" type="Integer"--%>
<%--@elvariable id="result" type="Double"--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演習 9.1 EL 式と JSTL の利用 (&lt;c:out&gt;タグ) 計算結果</title>
</head>
<body>
    <h1>結果</h1>
    <c:out value="${value1}" default=""/>
    <c:out value="${operator}" default=""/>
    <c:out value="${value2}" default=""/>
    ＝
    <c:out value="${result}" default=""/>
    <a href="/webapp/enshu09_1/top">トップページに戻る</a>
</body>
</html>
