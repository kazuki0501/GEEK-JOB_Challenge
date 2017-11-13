<%-- 
    Document   : challenge2-1
    Created on : 2017/11/13, 11:28:49
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
        <h1>Hello World!</h1>
        <%
            String text = "私の名前は野村和希です！よろしくお願いします！";
            out.print(text);
        %>
    </body>
</html>
