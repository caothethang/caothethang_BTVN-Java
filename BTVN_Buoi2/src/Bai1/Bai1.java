/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author thuan
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] a= new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++)
        {
            temp=a[i];
        
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
               
            }
        }
        }
        System.out.println("So lon thu ba trong mang la: ");
        System.out.println(a[n-3]);
            
        
    }
    
}
