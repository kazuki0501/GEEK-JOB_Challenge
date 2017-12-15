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
public class challenge15_5 {
    public static void main(String[] args){
        //自分の氏名について、バイト数と文字数を取得して、表示してください。
        String name = "野村和希";
        
        System.out.println("名前の文字数は..." + name.length());
        System.out.println("名前のバイト数は..." + name.getBytes().length);
        
    }
}
