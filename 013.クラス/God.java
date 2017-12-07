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
            //↑何故かセーフの場合表示されない・・・
            
            out.print("表示された文字がtrueならセーフ、falseならアウトです。ディーラーは..." + d.checkSum() + "<br>");
            out.print("表示された文字がtrueならセーフ、falseならアウトです。プレイヤーは..." + u.checkSum() + "<br><br>");
            //↑myCardsを全て足し、変数checkの中に判定後のtrueかfalseを格納
            //ここも何故かtrueの場合表示されない・・・
            //というかオープンメソッドでmyCardsの合計21以上を表示すると、false表示もでない。
            //両方アウトの場合は全て表示された
            
            out.print("セーフで、数字の多い方の勝ちです！");
            
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
