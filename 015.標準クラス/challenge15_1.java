/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class challenge15_1 {
    public static void main(String[] args){
        
        /*
        //当日の日付で日付情報を作成
        Date d = new Date();
                
        System.out.println(d);
        System.out.println(d.getTime());
        */

        Calendar c = Calendar.getInstance();
        c.set(2016,1,1,0,0,0);
        
        //System.out.println(c.get(Calendar.YEAR));
        
        System.out.println(c.getTime());
    }
}