/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class field extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet field</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet field at " + request.getContextPath() + "</h1>");
            
            /*
            以下の機能を実装してください。

            名前・性別・趣味を入力するページを作成してください。
            また、入力された名前・性別・趣味を記憶し、次にアクセスした際に記録されたデータを初期値として表示してください。
            ※Javaと同時に、HTMLの知識が必要になります。
            ※入力フィールドの使い方を調べてみましょう。
            */
            
            request.setCharacterEncoding("UTF-8");
            
            out.print("今回入力された名前" + "<br>");
            out.print(request.getParameter("name") + "<br><br>");
            out.print("今回入力された性別" + "<br>");
            out.print(request.getParameter("gender") + "<br><br>");
            out.print("今回入力された趣味" + "<br>");
            out.print(request.getParameter("hobby") + "<br><br>");
            
            HttpSession input_name = request.getSession();
            HttpSession input_gender = request.getSession();
            HttpSession input_hobby = request.getSession();
            
            
            String got_name = (String)input_name.getAttribute("session_name");
            String got_gender = (String)input_gender.getAttribute("session_gender");
            String got_hobby = (String)input_hobby.getAttribute("session_hobby");
            
            //セッションに何か記録されていれば
            if(got_name != null){
                out.print("前回入力された名前<br>");
                out.print(got_name + "<br>");
            }
            
            if(got_gender != null){
                out.print("前回入力された性別<br>");
                out.print(got_gender + "<br>");
            }
            
            if(got_hobby != null){
                out.print("前回入力された趣味<br>");
                out.print(got_hobby + "<br>");
            }
            
            //セッションに今回入力された各項目の情報を登録
            input_name.setAttribute("session_name", request.getParameter("name"));
            input_gender.setAttribute("session_gender", request.getParameter("gender"));
            input_hobby.setAttribute("session_hobby", request.getParameter("hobby"));
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
