<%-- 
    Document   : challenge16-1
    Created on : 2017/12/15, 16:16:47
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        /*
        以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
        ・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）
        */
        %>
        
        <form action="./challenge16_1.java" method="post">
            <input type="text" name="name">
            <input type="radio" name="sex" value="送信される文字列を指定、らしい">
            <textarea name="hobby" cols="50" rows="5"></textarea>
        </form>
    </body>
</html>
