/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.*;

/**
 *
 * @author guest1Day
 */
public class challenge15_9 {
    public static void main(String[] args) throws IOException{
        //ファイルに自己紹介を書き出し、保存してください。
        
        File fp = new File("C:\\Users\\guest1Day\\Documents\\GEEK-JOB_Challenge\\015.標準クラス\\challenge15.txt");
        
        FileWriter fw = new FileWriter(fp);
        fw.write("自己紹介");
        
        fw.close();
    }
}
