/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;
import java.io.*;
/**
 *
 * @author GL553VD
 */
public class DemoInputKarakter {
    public static void main(String[]args)throws IOException{
        System.out.println("Masukkan sembarang karakter:");
        char ch;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        ch=(char)br.read();
        System.out.println("Karakter yang dimasukkan adalah \'"+ch+"\'");
    }
}
