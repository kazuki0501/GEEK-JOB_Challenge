<%-- 
    Document   : challenge5-2
    Created on : 2017/11/18, 10:35:54
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
        int num = 3;
        
        switch(num){
            case 1:
                out.print("one");
                break;
            case 2:
                out.print("two");
                break;
            default:
                out.print("想定外");
                break;
            
        }
        %>
    </body>
</html>
