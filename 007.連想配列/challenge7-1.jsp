<%-- 
    Document   : challenge7-1
    Created on : 2017/11/18, 13:23:37
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
        <%@ page import = "java.util.HashMap" %>
        <%
        
        /* 以下の順で、連想配列を作成してください。
           "1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"
        */
        
        HashMap<String, String> data = 
                new HashMap<String, String>();
        data.put("1", "AAA");
        data.put("hello", "world");
        data.put("soeda", "33");
        data.put("20", "20");

        out.print("キー[1]の中身");
        out.print("<br>");
        out.print(data.get("1"));
        out.print("<br>");
        out.print("<br>");
        out.print("キー[hello]の中身");
        out.print("<br>");
        out.print(data.get("hello"));
        out.print("<br>");
        out.print("<br>");
        out.print("キー[soeda]の中身");
        out.print("<br>");
        out.print(data.get("soeda"));
        out.print("<br>");
        out.print("<br>");
        out.print("キー[20]の中身");
        out.print("<br>");
        out.print(data.get("20"));
        %>
    </body>
</html>
