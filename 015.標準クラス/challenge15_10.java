/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class challenge15_10 {
    public static void main(String[] args) throws IOException{
        
        /*
        １つJAVAの標準クラスを選び、実際にロジックを作成してみてください。
        また、この処理を作成するに当たり、下記を必ず実装してください。
        1. 処理の経過を書き込むログファイルを作成する。
        2. 処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。
        3. 書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。
        4. 最後に、ログファイルを読み込み、その内容を表示してください。
        */
        
        
        Date now = new Date();
        
        SimpleDateFormat sdf =
                new SimpleDateFormat("yy年 MM月 dd日 HH時 mm分 ss秒");
        
        
        File fp = new File("C:\\Users\\guest1Day\\Documents\\GEEK-JOB_Challenge\\015.標準クラス\\log.txt");
        
        FileWriter fw = new FileWriter(fp);
        fw.write(sdf.format(now) + "...処理開始！\r\n");
        
        int r = 20;
        
        double enshu = 2 * r * Math.PI;
        System.out.println("円周は..." + enshu);
        
        double menseki = r * r * Math.PI;
        System.out.println("円の面積は..." + menseki);
        
        fw.write(sdf.format(now) + "...処理終了！\r\n");
        
        fw.close();
        
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        
        br.close();
    }
}
