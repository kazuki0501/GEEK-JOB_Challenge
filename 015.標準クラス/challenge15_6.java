/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author guest1Day
 */
public class challenge15_6 {
    public static void main(String[] args){
        //自分のメールアドレスの「@」以降の文字を取得して、表示してください。
        String address = "kazukazuxi@gmail.com";
        
        System.out.println("ドメインは..." + address.substring(10));
        
    }
}