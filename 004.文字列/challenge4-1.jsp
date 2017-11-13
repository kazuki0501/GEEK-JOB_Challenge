<%-- 
    Document   : challenge4-1
    Created on : 2017/11/13, 13:47:09
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
        String moji1 = "groove";
        String moji2 = "-";
        String moji3 = "gear";
        
        out.print(moji1 + moji2 + moji3);
        %>
    </body>
</html>
