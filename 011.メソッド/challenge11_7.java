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

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class challenge11_7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /*
    課題「引数、戻り値1」の3人分のプロフィールのうち、1人だけ住所の値をnullで定義し、
    ループ処理で全員分のプロフィールをid以外表示する処理を作成してください。
    この際、nullになっているデータはcontinueで飛ばしながら表示してください。
    */
    
    String[] profile(int order){
    
        String id[] = {"123456","123457","123458"};
        String name[] = {"鈴木","田中","佐藤"};
        String birth[] = {"3月1日","6月1日","5月1日"};
        String address[] = {"null","東京都","埼玉県"};
            
        String[] result = new String[4];
        
            result[0] = id[order];
            result[1] = name[order];
            result[2] = birth[order];
            result[3] = address[order];
        
        return result;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11_7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge11_7 at " + request.getContextPath() + "</h1>");
            
            int n;
            for(n = 0; n < 3; n++){
                out.println("名前：" + profile(n)[1] + "<br>");
                out.println("生年月日：" + profile(n)[2] + "<br>");
                
                if(profile(n)[3] == "null"){
                   out.println("<br>");
                   continue; 
                }else{
                    out.println("住所：" + profile(n)[3] + "<br>" + "<br>");
                }
            }
            
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
