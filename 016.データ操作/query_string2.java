/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class query_string2 extends HttpServlet {

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
            out.println("<title>Servlet query_string2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet query_string2 at " + request.getContextPath() + "</h1>");
            
            /*
            クエリストリングを利用して、以下の処理を実現してください。

            1. 簡易素因数分解のロジックを作成します。
            クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
            元の値と素因数分解の結果を表示するようにしてください。
            2ケタ以上の素数が含まれた数値の場合は、
            「元の値　1ケタの素因数　余った値」と表記してください
            */
            
            request.setCharacterEncoding("UTF-8");
            
            int count = Integer.parseInt(request.getParameter("num"));
            int x = count;
            boolean hantei = true;
            ArrayList<Integer> sosu = new ArrayList<Integer>();
            
            
            while(hantei == true){
                if(count % 2 == 0){
                    count = count / 2;
                    sosu.add(2);
                }else if(count % 3 == 0){
                    count = count / 3;
                    sosu.add(3);
                }else if(count % 5 == 0){
                    count = count / 5;
                    sosu.add(5);
                }else if(count % 7 == 0){
                    count = count / 7;
                    sosu.add(7);
                }else{
                    hantei = false;
                }
            }
            
            if(count < 10){
                out.print("元の値は、" + x + "です。<br>");
                out.print("素因数分解の結果は、" + count + "です。<br>");
            }else if(count >= 10){
                out.print("元の値は、" + x + "です。<br>");
                out.print("一桁の素因数は、" + sosu + "です。<br>");
                out.print("余った数は" + count + "です。<br>");
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
