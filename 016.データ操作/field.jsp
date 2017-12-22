<%-- 
    Document   : field
    Created on : 2017/12/18, 10:29:49
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%            
        //セッション変数を用意して、セッションのデータを代入
        HttpSession input_name = request.getSession();
        HttpSession input_gender = request.getSession();
        HttpSession input_hobby = request.getSession();
            
        //変数got_〇〇〇にセッションから取り出した各データを代入
        String got_name = (String)input_name.getAttribute("session_name");
        String got_gender = (String)input_gender.getAttribute("session_gender");
        String got_hobby = (String)input_hobby.getAttribute("session_hobby");
        
        if(got_name == null){
            got_name = "";
        }
        
        if(got_gender == null){
            got_gender = "";
        }
        
        if(got_hobby == null){
            got_hobby = "";
        }
    %>
    <body>
        <form action="./field">
            各項目を入力してください。<br>
            <br>
            名前<br>
            <input type="text" name="name" value='<%= got_name %>'><br>
            <br>
            性別<br>
            <input type="text" name="gender"value='<%= got_gender %>'><br>
            <br>
            趣味<br>
            <input type="text" name="hobby"value='<%= got_hobby%>'><br>
            <br>
            <input type="submit" name="submitbutton"><br>
        </form>
    </body>
</html>