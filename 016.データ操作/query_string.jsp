<%-- 
    Document   : query_string
    Created on : 2017/12/16, 13:05:00
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
        <form action="./query_string">
            商品種別<br>
            <input type="radio" name="type" value="1"> 雑貨<br>
            <input type="radio" name="type" value="2"> 生鮮食品<br>
            <input type="radio" name="type" value="3"> その他<br>
            <br>
            個数<br>
            <input type="text" name="count"><br>
            <br>
            総額<br>
            <input type="text" name="total"><br>
            <br>
            <br>
            <input type="submit" name="submitbutton"><br>
        </form>
    </body>
</html>
