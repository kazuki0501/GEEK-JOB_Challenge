<%-- 
    Document   : challenge16-2
    Created on : 2017/12/15, 16:40:23
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
        
        <form action="./challenge16" method="post">
            名前<br>
            <input type="text" name="nametext"><br>
            <br>
            性別<br>
            <input type="radio" name="radiobutton" value="男"> 男<br>
            <input type="radio" name="radiobutton" value="女"> 女<br>
            <br>
            趣味記入欄<br>
            <textarea name="hobbytextarea" cols="50" rows="5"></textarea><br>
            <br>
            <br>
            <input type="submit" name="submitbutton">
        </form>
        
    </body>
</html>
