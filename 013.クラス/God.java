/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "God", urlPatterns = {"/God"})
public class God extends HttpServlet {

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
            out.println("<title>Servlet God</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet God at " + request.getContextPath() + "</h1>");
            
            //同じフォルダ内ならこんな感じでインスタンス化してからメソッド呼び出しすればおｋ
            Dealer d = new Dealer();
            User u = new User();
            
            out.print("ディーラーが引いたカードは：" + d.deal() + "<br>");
            out.print("プレイヤーが引いたカードは：" + u.deal() + "<br><br>");
            
            out.print("ディーラーが新しく引いたカードは：" + d.hit() + "<br>");
            out.print("プレイヤーが新しく引いたカードは：" + u.hit() + "<br><br>");
            
            d.setCard();//ディーラーの引いたdealCardとhitCardをmyCardsに格納
            u.setCard();//プレイヤーの引いたdealCardとhitCardをmyCardsに格納
            
            out.print("ディーラーのカードの合計値は..." + d.open() + "です。<br>");
            out.print("プレイヤーのカードの合計値は..." + u.open() + "です。<br><br>");
            
            if(d.checkSum() == false && u.checkSum() == false){
                out.print("ディーラーもプレイヤーもバーストしました！<br>");
                out.print("両方負けです！<br>");
            }else if(d.checkSum() == false){
                out.print("ディーラーがバーストしました！<br>");
                out.print("ディーラーの負けです！<br>");
            }else if(u.checkSum() == false){
                out.print("プレイヤーがバーストしました！<br>");
                out.print("プレイヤーの負けです！<br>");
            }else if(d.open() == u.open()){
                out.print("カードの合計値が一緒なので引き分けです！<br>");
            }else if(d.open() > u.open()){
                out.print("ディーラーのカードの合計値の方が高いのでディーラーの勝ちです！<br>");
            }else if(u.open() > d.open()){
                out.print("プレイヤーのカードの合計値の方が高いのでプレイヤーの勝ちです！<br>");
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
