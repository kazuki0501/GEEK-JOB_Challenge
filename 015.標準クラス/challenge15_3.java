/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author guest1Day
 */
public class challenge15_3 {
    public static void main(String[] args){
        
        //2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示してください。
        
        Calendar c = Calendar.getInstance();
        c.set(2016,10,4,10,0,0);
        
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年 MM月 d日 HH時 m分 s秒");
        
        System.out.println(sdf.format(c.getTime()));
    }
}