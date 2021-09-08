<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>演習6.1 暗黙オブジェクトの利用 (outオブジェクト)</title>
</head>
<body>
10回繰り返して表示
<br>
<% for (int i = 1; i <= 10; i++) { %>
    <% out.println(i); %>回目
    <br>
<% } %>
</body>
</html>
