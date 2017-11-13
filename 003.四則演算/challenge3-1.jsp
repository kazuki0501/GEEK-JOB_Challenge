<%-- 
    Document   : challenge3-1
    Created on : 2017/11/13, 13:08:16
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
        int num1 = 10;
        final int num2 = 5;
        
        out.print(num1 + num2);
        out.print("<br>");
        out.print(num1 - num2);
        out.print("<br>");
        out.print(num1 * num2);
        out.print("<br>");
        out.print(num1 / num2);
        out.print("<br>");
        out.print(num1 % num2);
        %>
    </body>
</html>
