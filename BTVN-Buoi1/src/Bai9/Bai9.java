/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==0 && b!=0)
            System.out.println("Phương trình vô nghiệm");
        else if(b==0 && a!=0)
            System.out.println("Phuong trình có nghiệm x=0");
        else if(a==0 && b==0)
            System.out.println("Phương trình vô số nghiệm");
        else
        {
            float x=(float)-b/a;
            System.out.println("Nghiệm của pt:"+ x);
        }
        
        
    }
}
