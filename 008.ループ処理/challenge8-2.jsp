<%-- 
    Document   : challenge8-2
    Created on : 2017/11/18, 14:18:26
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
        while文を利用して、以下の処理を実現してください。
        1. 1000を2で割り続け、100より小さくなったらループを抜ける処理
        */
        
        int num = 1000;
        
        while(num >= 100){
            num = num / 2;
            out.print(num);
            out.print("<br>");
        }
        %>
    </body>
</html>
