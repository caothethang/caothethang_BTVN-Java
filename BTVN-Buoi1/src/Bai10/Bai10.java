/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==0)
        {
            if(b==0 && c==0)
                System.out.println("Phương trình vô số nghiệm");
            else if(b!=0 && c==0)
                System.out.println("Phương trình có nghiệm x=0");
            else if(b==0 && c!=0)
                System.out.println("Phương trình vô nghiệm");
            else
                System.out.println("Phương trình có nghiệm x= "+(float)-c/b);       
        }
        else
        {
            int delTa=b*b-4*a*c;
            if(delTa<0)
                System.out.println("Phương trình vô nghiệm");
            else if(delTa==0)
                System.out.println("Phương trình có nghiệm kép x="+ (float)-b/(2*a));
            else
            {
                 float x1=(float)(-b-Math.sqrt(delTa))/(2*a);
                 float x2=(float)(-b+Math.sqrt(delTa))/(2*a);
                 System.out.println("Phương trình có 2 nghiệm phân biệt x1="+ x1+"x2="+ x2);
            }
                
            }
               
            
                        
        }
    
}
