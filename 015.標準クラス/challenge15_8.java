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
class challenge15_8 {
    public static void main(String[] args) throws IOException{
        //ファイルから自己紹介を読み出し、表示してください。
        
        File fp = new File("C:\\Users\\guest1Day\\Documents\\GEEK-JOB_Challenge\\015.標準クラス\\challenge15.txt");
        
        FileReader fr = new FileReader(fp);
        
        BufferedReader br = new BufferedReader(fr);
        
        System.out.print(br.readLine());
        
        br.close();
    }
}
