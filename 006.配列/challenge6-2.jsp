<%-- 
    Document   : challenge6-2
    Created on : 2017/11/18, 11:52:29
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
        <%@ page import = "java.util.ArrayList" %>
    
    <%
    ArrayList<String> datas = new ArrayList<String>();
    
    datas.add("10");
    datas.add("100");
    datas.add("soeda");
    datas.add("hayashi");
    datas.add("-20");
    datas.add("118");
    datas.add("END");
    
    out.println("変更前");
    out.print(datas.get(2));
    out.print("<br>");
    
    datas.set(2, "33");
    out.println("変更後");
    out.print(datas.get(2));
    
    /*
    String[] data = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
    
    out.println("変更前");
    out.println(data[2]);
    out.println("<br>");

    out.println("変更後");
    data[2] = "33";
    out.println(data[2]);
    */
    
    %>

    </body>
</html>
