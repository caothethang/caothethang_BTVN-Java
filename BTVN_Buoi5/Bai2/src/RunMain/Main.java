/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunMain;

import Knight.Knight;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Knight Hiepsi=new Knight();
        Hiepsi.Input();
        Hiepsi.Output();
        while(Hiepsi.getMP()>=50){
            Hiepsi.Skill();
            Hiepsi.Output();
        }
        // TODO code application logic here
    }
    
}
