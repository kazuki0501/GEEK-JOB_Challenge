/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class challenge15_4 {
    public static void main(String[] args){
        
        //2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年 MM月 d日 HH時 m分 s秒");
                
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2015,0,1,0,0,0);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2015,11,31,23,59,59);
        
        //Date tempD = cal1.getTime();
        //long tempL  = tempD.getTime();
        //↑こんな感じのイメージ
        long cal1_num = cal1.getTime().getTime();
        long cal2_num = cal2.getTime().getTime();
        
        long result = cal2_num - cal1_num;
        
        System.out.print(result);
        
    }
}