/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,giatien=3000;
        long tong = 0;
        while(i<=n)
        {
            if(i>=1 && i<=50) {
                giatien=4000;
                tong+=giatien;
            }
            else if(i>50)
            {
                if(i<=100)
                {
                 giatien=3000;
                tong+=giatien;
                }
                else {
                    giatien-=10;
                    if(giatien>=0) tong+=giatien; 
                }
            }
            i++;
        }
        System.out.println(tong);
    }
}
