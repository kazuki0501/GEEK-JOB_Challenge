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
public class challenge11_6 extends HttpServlet {

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
    引数が１つのメソッドを作成してください。
    メソッドの中の処理は、３人分のプロフィール（項目は戻り値2と同様）を作成し、引数として渡された値と同じIDを持つ人物のプロフィールを返却する様にしてください。
    それ以降は課題「戻り値2」と同じ処理にしてください。
    */
    
    String[] profile(String search){
    
        String id[] = {"123456","123457","123458"};
        String name[] = {"鈴木","田中","佐藤"};
        String birth[] = {"3月1日","6月1日","5月1日"};
        String address[] = {"神奈川県","東京都","埼玉県"};
        
        int i;
        String[] result = new String[4];
        
        for(i = 0; i < id.length; i++){
            if(search.equals(id[i])){
                result[0] = id[i];
                result[1] = name[i];
                result[2] = birth[i];
                result[3] = address[i];
            }
        }
        
        return result;
        
        /*
        String[] user1 = {"123456","鈴木","3月1日","神奈川県"};
        String[] user2 = {"123457","田中","6月1日","東京都"};
        String[] user3 = {"123458","佐藤","5月1日","東京都"};
        */
        
        /*
        HashMap<String,String>user1 = new HashMap<String,String>();
        user1.put("ID", "123456");
        user1.put("名前", "鈴木");
        user1.put("生年月日", "3月1日");
        user1.put("住所", "神奈川県");
        
        HashMap<String,String>user2 = new HashMap<String,String>();
        user2.put("ID", "123457");
        user2.put("名前", "田中");
        user2.put("生年月日", "5月1日");
        user2.put("住所", "東京都");
        
        HashMap<String,String>user3 = new HashMap<String,String>();
        user3.put("ID", "123458");
        user3.put("名前", "佐藤");
        user3.put("生年月日", "8月1日");
        user3.put("住所", "埼玉県");
        */
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11_6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge11_6 at " + request.getContextPath() + "</h1>");
            
            String check = "123458";
            
            out.println("名前：" + profile(check)[1] + "<br>");
            out.println("生年月日：" + profile(check)[2] + "<br>");
            out.println("住所：" + profile(check)[3] + "<br>");
            
            /*
            out.println("生年月日：" + profile().get("生年月日") + "<br>");
            out.println("住所：" + profile().get("住所") + "<br>");
            */
            
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
