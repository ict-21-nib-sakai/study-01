<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>演習 8.2 スコープの利用 (セッションスコープ) 入力フォーム</title>
</head>
<body>
<div>
    <h1>計算</h1>
    <p>整数値を入力してください</p>
    <form action="/webapp/enshu08_2/result" method="post">
        <div>
            <input type="number" name="value1" min="0" step="1">

            <label>
                ＋<input type="radio" name="operator" value="＋">
            </label>

            <label>
                －<input type="radio" name="operator" value="－">
            </label>

            <label>
                ×<input type="radio" name="operator" value="×">
            </label>

            <label>
                ÷<input type="radio" name="operator" value="÷">
            </label>

            <input type="number" name="value2" min="0" step="1">
        </div>

        <div>
            <input type="submit" value="計算">
        </div>
    </form>

    <h1>前回の計算結果</h1>
    <p>
        <%
            if ((Boolean) request.getAttribute("has_session")) {
        %>
        <%= session.getAttribute("value1") %>
        <%= session.getAttribute("operator") %>
        <%= session.getAttribute("value2") %>
        ＝
        <%= session.getAttribute("result") %>
        <%
            }
        %>
    </p>
</div>
</body>
</html>
