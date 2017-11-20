/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import org.camp.servlet.ResultData;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "FortuneTelling", urlPatterns = {"/FortuneTelling"})
public class FortuneTelling extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        //jspと連携
        final String result = "/WEB-INF/jsp/FortuneTellingResult.jsp";
        
        //運勢一覧の配列作成
        String luckList[] = {"大吉", "中吉", "小吉", "吉", "半吉", "末小吉", "凶", "小凶", "半凶", "末凶", "大凶"};
        
        //乱数のクラスからインスタンス化
        Random rand = new Random();
        
        //配列番号(Index)にランダムな値(配列の範囲内の数値)を代入
        Integer Index = rand.nextInt(luckList.length);
        
        //リクエストスコープへ結果を設定
        ResultData data = new ResultData();
        data.setD(new Date());
        data.setLuck(luckList[Index]);
        request.setAttribute("DATA", data);
        
        RequestDispatcher rd = request.getRequestDispatcher(result);
        rd.forward(request, response);
        
        /*
        try {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FortuneTelling</title>");            
            out.println("</head>");
            out.println("<body>");
            //運勢一覧の配列の、配列の範囲内でランダムな要素を表示
            out.println("<h1>あなたの今日の運勢は..."+ luckList[Index] +"！</h1>");
            //もともとh1の間に入ってた構文のバックアップ↑☆Servlet FortuneTelling at " + request.getContextPath() + "☆
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        */
        
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
