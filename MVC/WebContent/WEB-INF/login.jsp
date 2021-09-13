<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form action="/MVC/LoginServlet" method="POST">
    <input type="text" name="userid" placeholder="ユーザIDを入力してください"><br>
    <input type="password" name="pass"><br>
    <input type="submit" value="ログイン実行">
</form>
</body>
</html>
