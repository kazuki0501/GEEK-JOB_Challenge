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
public class challenge15_2 {
    public static void main(String[] args){
        
        //現在の日時を「年-月-日 時:分:秒」で表示してください。
        
        Date now = new Date();
        
        Calendar c = Calendar.getInstance();
        
        SimpleDateFormat sdf =
                new SimpleDateFormat("yy年 MM月 dd日 HH時 mm分 ss秒");
        
        System.out.println(sdf.format(now));
    }
}