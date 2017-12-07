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

import java.util.Random;
import java.util.ArrayList;

abstract class Human{//スライド1 Humanという抽象クラスの作成
    
    abstract public int open();
    //↑スライド1 openというabstractな公開(public?)メソッドを用意
    //abstractメソッドは{}をつけず、継承およびオーバーライド前提の特殊なメソッド？
    
    abstract public ArrayList<Integer> setCard();
    //↑スライド1 setCardというArrayListを引数とした、abstractな公開(public?)メソッドを用意
    //abstractメソッドは{}をつけず、継承およびオーバーライド前提の特殊なメソッド？
    //引数の配列はとりあえず指定しただけ！後で変えたりするかも？
    
    abstract public boolean checkSum();
    //↑スライド1 checkSumというabstractな公開(public?)メソッドを用意
    //abstractメソッドは{}をつけず、継承およびオーバーライド前提の特殊なメソッド？
    
    ArrayList<Integer> myCards = new ArrayList<Integer>();;
    //↑スライド1 myCardsというArrayListの変数を用意
}

class Dealer extends Human{//スライド2 Humanクラスを継承してDealerクラス作成
    //抽象クラスを継承してるのでオーバーライドしなきゃいけない→した！
    
    ArrayList<Integer> cards;//ここはフィールドなので、変数宣言のみで代入まではするべきではない
    ArrayList<Integer> hitcard;//ここはフィールドなので、変数宣言のみで代入まではするべきではない
    ArrayList<Integer> dealcard;//ここはフィールドなので、変数宣言のみで代入まではするべきではない
    
    public Dealer(){ //スライド3 cardsというArrayListの変数を用意し、初期処理でこのcardsにすべてのトランプを持たせる
        
         cards = new ArrayList<Integer>();//フィールドで宣言したArrayList型変数
        
        int i,j;
        for(j = 0; j < 4; j++){
            for(i = 1; i <= 13; i++){
                cards.add(i);
            }
        }
        
//        return Dealer;　のようなイメージ
    }
    
    public ArrayList<Integer> deal(){ //スライド3 dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却
        
        //戻り値にするArrayList用意
        dealcard = new ArrayList<Integer>();
        
        //ランダム処理で乱数を２つ作成
        Random rnd = new Random();
        int ran1 = rnd.nextInt(cards.size());
        int ran2 = rnd.nextInt(cards.size());
        
        //作成した乱数を戻り値用のArrayListに代入
        dealcard.add(cards.get(ran1));
        dealcard.add(cards.get(ran2));
        
        return dealcard;
    }
    
    public ArrayList<Integer> hit(){//スライド3 hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却
        
        //戻り値にするArrayList用意
        hitcard = new ArrayList<Integer>();
        
        //ランダム処理で乱数を1つ作成
        Random rnd = new Random();
        int ran3 = rnd.nextInt(cards.size());
        
        //作成した乱数を戻り値用のArrayListに代入
        hitcard.add(cards.get(ran3));
        
        return hitcard;
    }
    
    @Override
    public int open(){
        int i;
        int sum = 0;
        
        for(i = 0; i < myCards.size(); i++){//myCardの要素数分処理を繰り返す
            sum = sum + myCards.get(i); //myCardsを全て足す    
        }
    return sum;
    }
    
    public ArrayList<Integer> setCard(){
        myCards.add(dealcard.get(0)); //dealcardの1枚目をArrayList myCardsの配列番号0に代入
        myCards.add(dealcard.get(1)); //dealcardの2枚目をArrayList myCardsの配列番号1に代入
        myCards.add(hitcard.get(0)); //hitcardの1枚目をArrayList myCardsの配列番号2に代入
        
        return myCards;
    }
    
    public boolean checkSum(){
        int i;
        int sum = 0;
        boolean check;
        
        for(i = 0; i < myCards.size(); i++){//myCardの要素数分処理を繰り返す
            sum = sum + myCards.get(i); //myCardsを全て足す    
        }
        
    check = (sum <= 21); //myCardsの合計が21以下なら真、それ以外なら偽
    return check;
    }
}

class User extends Human{//スライド2 Humanクラスを継承してUserクラス作成
    //抽象クラスを継承してるのでオーバーライドしなきゃいけない→した！
    
    ArrayList<Integer> cards;//ここはフィールドなので、変数宣言のみで代入まではするべきではない
    ArrayList<Integer> hitcard;//ここはフィールドなので、変数宣言のみで代入まではするべきではない
    ArrayList<Integer> dealcard;//ここはフィールドなので、変数宣言のみで代入まではするべきではない
    
    public User(){ //スライド3 cardsというArrayListの変数を用意し、初期処理でこのcardsにすべてのトランプを持たせる
        
         cards = new ArrayList<Integer>();//フィールドで宣言したArrayList型変数
        
        int i,j;
        for(j = 0; j < 4; j++){
            for(i = 1; i <= 13; i++){
                cards.add(i);
            }
        }
    }
    
    public ArrayList<Integer> deal(){ //スライド3 dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却
        
        //戻り値にするArrayList用意
        dealcard = new ArrayList<Integer>();
        
        //ランダム処理で乱数を２つ作成
        Random rnd = new Random();
        int ran1 = rnd.nextInt(cards.size());
        int ran2 = rnd.nextInt(cards.size());
        
        //作成した乱数を戻り値用のArrayListに代入
        dealcard.add(cards.get(ran1));
        dealcard.add(cards.get(ran2));
        
        return dealcard;
    }
    
    public ArrayList<Integer> hit(){//スライド3 hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却
        
        //戻り値にするArrayList用意
        hitcard = new ArrayList<Integer>();
        
        //ランダム処理で乱数を1つ作成
        Random rnd = new Random();
        int ran3 = rnd.nextInt(cards.size());
        
        //作成した乱数を戻り値用のArrayListに代入
        hitcard.add(cards.get(ran3));
        
        return hitcard;
    }
    
    @Override
    public int open(){
        int i;
        int sum = 0;
        
        for(i = 0; i < myCards.size(); i++){//myCardの要素数分処理を繰り返す
            sum = sum + myCards.get(i); //myCardsを全て足す    
        }
    return sum;
    }
    
    public ArrayList<Integer> setCard(){
        myCards.add(dealcard.get(0)); //dealcardの1枚目をArrayList myCardsの配列番号0に代入
        myCards.add(dealcard.get(1)); //dealcardの2枚目をArrayList myCardsの配列番号1に代入
        myCards.add(hitcard.get(0)); //hitcardの1枚目をArrayList myCardsの配列番号2に代入
        
        return myCards;
    }
    
    public boolean checkSum(){
        int i;
        int sum = 0;
        boolean check;
        
        for(i = 0; i < myCards.size(); i++){//myCardの要素数分処理を繰り返す
            sum = sum + myCards.get(i); //myCardsを全て足す    
        }
        
    check = (sum <= 21); //myCardsの合計が21以下なら真、それ以外なら偽
    return check;
    }
    
}

/**
 *
 * @author guest1Day
 */
public class challenge13_blackjack extends HttpServlet {

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
            out.println("<title>Servlet challenge13_blackjack</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge13_blackjack at " + request.getContextPath() + "</h1>");
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
