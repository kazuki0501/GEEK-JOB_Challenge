<%-- 
    Document   : challenge6-1
    Created on : 2017/11/18, 11:38:00
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
    String[] data = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
    
    //ちゃんと入ってるか確認。
    out.println(data[0]);
    out.println("<br>");
    out.println(data[1]);
    out.println("<br>");
    out.println(data[2]);
    out.println("<br>");
    out.println(data[3]);
    out.println("<br>");
    out.println(data[4]);
    out.println("<br>");
    out.println(data[5]);
    out.println("<br>");
    out.println(data[6]);
    %>
    </body>
</html>
