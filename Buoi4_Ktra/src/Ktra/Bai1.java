/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ktra;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a;
        int count=0,tong=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>'0' && s.charAt(i)<'9')
            {
                a=s.charAt(i)-48;
                if(a%2==0)
                {
                    count++;
                    tong+=a;
                }
            }
        }
        System.out.println("So cac so chan");
        System.out.println(count);
        System.out.println("Tong cua chung");
        System.out.println(tong);
    }
}
