<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--@elvariable id="value1" type="Integer"--%>
<%--@elvariable id="operator" type="String"--%>
<%--@elvariable id="value2" type="Integer"--%>
<%--@elvariable id="result" type="Double"--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>演習 9.1 EL 式と JSTL の利用 (&lt;c:out&gt;タグ) 入力フォーム</title>
</head>
<body>
<div>
    <h1>計算</h1>
    <p>整数値を入力してください</p>
    <form action="/webapp/enshu09_1/result" method="post">
        <div>
            <input type="number" name="value1" min="0" step="1">

            <label>
                ＋<input type="radio" name="operator" value="+">
            </label>

            <label>
                －<input type="radio" name="operator" value="-">
            </label>

            <label>
                ×<input type="radio" name="operator" value="*">
            </label>

            <label>
                ÷<input type="radio" name="operator" value="/">
            </label>

            <input type="number" name="value2" min="0" step="1">
        </div>

        <div>
            <input type="submit" value="計算">
        </div>
    </form>

    <%--@elvariable id="has_session" type="Boolean"--%>
    <c:if test="${has_session}">
        <h1>前回の計算結果</h1>
        <p>
            <c:out value="${value1}" default=""/>
            <c:out value="${operator}" default=""/>
            <c:out value="${value2}" default=""/>
            ＝
            <c:out value="${result}" default=""/>
        </p>
    </c:if>
</div>
</body>
</html>
