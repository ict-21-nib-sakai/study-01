<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演習 8.2 スコープの利用 (セッションスコープ) 計算結果</title>
</head>
<body>
    <h1>結果</h1>
    <%= request.getAttribute("value1") %>
    <%= request.getAttribute("operator") %>
    <%= request.getAttribute("value2") %>
    ＝
    <%= request.getAttribute("result") %>
    <a href="/webapp/enshu08_2/top">トップページに戻る</a>
</body>
</html>
