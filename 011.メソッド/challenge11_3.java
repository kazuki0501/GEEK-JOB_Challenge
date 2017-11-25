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
public class challenge11_3 extends HttpServlet {

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
    1. ３つの引数を持ち、渡された数値で掛け算をするメソッドを作成します。
    メソッドは、１つ目の引数と２つ目の引数を掛け算し、３つ目の引数がtrueの場合は結果を２乗させてください。
    また、２つ目の引数は5、３つ目の引数はfalseをデフォルト値として設定してください。
    2. 作成したメソッドを呼び出し、結果を表示してください。
    */
    
    void kakezan(int num1, int num2, boolean hantei, PrintWriter pw){
        int result;
        result = num1 * num2;
        pw.print(result + "<br>");
        
        if(hantei){
            pw.print(result * result + "<br>");
        }
        
    }
    
    void kakezan(int num1,PrintWriter pw){
        kakezan(num1, 5, false, pw);
    }
    
    //試しと確認用
    /*
    void kakezan(int num1, int num2, PrintWriter pw){
        kakezan(num1, num2, false, pw);
    }
    */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge11_3 at " + request.getContextPath() + "</h1>");
            
            kakezan(5,2,true,out);
            
            kakezan(3, out);
            
            //試しと確認用
            //kakezan(5,3,out);
            
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
