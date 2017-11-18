<%-- 
    Document   : challenge5-3
    Created on : 2017/11/18, 11:04:33
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
        char ward = 'あ';
        
        switch(ward){
            case 'あ':
                out.print("日本語");
                break;
            case 'A':
                out.print("英語");
                break;          
        }
        %>
    </body>
</html>
