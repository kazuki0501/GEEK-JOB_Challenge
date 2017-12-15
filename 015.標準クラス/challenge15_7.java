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
public class challenge15_7 {
    public static void main(String[] args){
        //以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
        //「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        
        word = word.replace("I", "い");
        word = word.replace("U", "う");
        System.out.println(word);
    }
}