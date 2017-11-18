<%-- 
    Document   : challenge8-1
    Created on : 2017/11/18, 13:54:00
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
        double num = 8;
        
        for(int i=0 ; i<19 ; i++){
            num = num * 8;
        }
        
        out.print(num);
        %>
    </body>
</html>
