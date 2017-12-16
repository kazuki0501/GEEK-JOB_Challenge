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

/**
 *
 * @author guest1Day
 */
public class query_string extends HttpServlet {

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
            out.println("<title>Servlet query_string</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet query_string at " + request.getContextPath() + "</h1>");
            
            /*
            クエリストリングを利用して、以下の処理を実現してください。

            ○想定されるクエリストリング
            http://localhost:8080/対象ファイル.jsp?total=総額&count=個数&type=商品種別
            例）http://localhost:8080/対象ファイル.jsp?total=1500&count=10&type=2
            　⇒総額1500円、10個、商品種別は2

            1. 受け取った商品種別を以下の対応で日本語表示してください。
            　 雑貨、2：生鮮食品、3:その他
            　 例)typeが2だったら、「生鮮食品」
            
            2. 受け取った総額と個数から、１個当たりの値段を算出し、表示してください。
            
            3. 総額に応じたポイントが付きます。ポイントを計算し、表示してください。
            　 3000円以上で、4%
            　 5000円以上で、5%
            */
            
            request.setCharacterEncoding("UTF-8");
            
            //受け取った商品種別を以下の対応で日本語表示
            int type = Integer.parseInt(request.getParameter("type"));
            out.print("ご購入いただいた商品種別は...<br>");
            if(type == 1){
                out.print("『雑貨』");
            }else if(type == 2){
                out.print("『生鮮食品』");
            }else if(type == 3){
                out.print("『その他』");
            }
            out.print("カテゴリの商品です。<br><br>");
            
            //情報をint型に変換
            int count = Integer.parseInt(request.getParameter("count"));
            int total = Integer.parseInt(request.getParameter("total"));
            
            //受け取った総額と個数から１個当たりの値段を算出し表示
            out.print("1個当たりの値段は...<br>");
            int price = total / count;
            out.print(price);
            out.print("円です。<br><br>");
            
            //総額に応じたポイントが付きます。ポイントを計算し表示
            out.print("総額に応じたポイントが付きます。今回付与されたポイントは...<br>");
            double point = 0;
            if(total >= 3000){
                point = total * 0.04;
            }else if(total >= 5000){
                point = total * 0.05;
            }
            out.print(point);
            out.print("ポイントです！<br>");
            
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
