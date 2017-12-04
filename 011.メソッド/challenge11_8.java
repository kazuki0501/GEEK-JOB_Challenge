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
public class challenge11_8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String[] profile(int order){
    
        String id[] = {"123456","123457","123458"};
        String name[] = {"鈴木","田中","佐藤"};
        String birth[] = {"3月1日","6月1日","5月1日"};
        String address[] = {null,"東京都","埼玉県"};
            
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
            out.println("<title>Servlet challenge11_8</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge11_8 at " + request.getContextPath() + "</h1>");
            
            /*
            課題「引数、戻り値2」の処理において、Integer limit=2を用意し、
            limitを利用して２名のプロフィール表示までで停止する様に処理を実装してください。
            */
            
            
            int i;
            Integer limit = 2;
            
            for(i = 0; i < limit; i++){
                
                String[] result2 = profile(i);
                
                out.print(result2[1] + "<br>");  // 名前を表示
                out.print(result2[2] + "<br>");  // 生年月日を表示
                
                if(profile(i)[3] == null){
                    out.println("<br>");
                    continue; 
                }else{
                    out.print(result2[3] + "<br>");  // 住所を表示
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
