/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;

/**
 *
 * @author guest1Day
 */
public class cookie extends HttpServlet {

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
        
        // Try-with-resource 文（ Java9 で改良されている）
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cookie</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cookie at " + request.getContextPath() + "</h1>");
            
            //クッキーに現在時刻を記録し、次にアクセスした際に、前回記録した日時を表示してください。
            
            //Cookie型の配列csに、クッキーの情報を入れる
            Cookie[] cs = request.getCookies();
            
            if(cs != null){
                for(int i = 0; i < cs.length; i++){
                    if(cs[i].getName().equals("logintime")){
                        String decoded = URLDecoder.decode(cs[i].getValue(), "UTF-8");
                        out.print("最後のログインは、" + decoded);
                        break;
                    }
                }
            }
            
            //現在時刻インスタンス
            Date now = new Date();
            //時刻表示フォーマット
            SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年 MM月 d日 HH時 m分 s秒");
            
            //文字のエンコード（パソコン→ネットワークの処理）
            String encoded = URLEncoder.encode(sdf.format(now), "UTF-8");

            //Cookieに現在時刻を登録、反映
            Cookie c = new Cookie("logintime", encoded);
            //Cookie c = new Cookie("logintime", sdf.format(now));
            response.addCookie(c);
            
            out.println("</body>");
            out.println("</html>");
        }
        
        /*
        例外処理で、本来はこういうトライ文、キャッチ文で記述する
        catch(Exception e){
            System.out.print(e);
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
