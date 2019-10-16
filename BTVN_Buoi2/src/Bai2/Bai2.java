/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author thuan
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int tong=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>'0' && s.charAt(i)<'9')
            {
                int n=(int) s.charAt(i)-48;
                tong=tong+n;
            }
        }
        System.out.println(tong);
    }
}
