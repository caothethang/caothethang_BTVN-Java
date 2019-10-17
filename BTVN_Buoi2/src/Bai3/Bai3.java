/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3 {
    static int []a;
    public static void nhap(int n) {
        Scanner sc= new Scanner(System.in);
         a=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
  
    }
    public static void xuat(int a[],int n){
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
  
    }
    public static void add(int a[],int n) {
        Scanner sc=new Scanner(System.in); 
        int k=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n-1;i>=k-1;i--)
        {
            a[i+1]=a[i];
        }
        a[k-1]=m;
        
    }
    public static void xoa(int a[],int n) {
        Scanner sc=new Scanner(System.in);
          int k=sc.nextInt();
        for(int i=k-1;i<n;i++)
        {
            a[i]=a[i+1];
        }
        
    }
    public static void daonguoc(int a[],int n) {
        int temp;
        for(int i=0;i<n/2;i++)
        {
             temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        
    }
    public static void chia(int a[],int n) {
        System.out.println("So a[1]:"+a[1]);
        System.out.println("Cac so chia het cho a[1]");
        for(int i=0;i<n;i++)
        {
            if(a[i]%a[1]==0 && i!=1)
                System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b;
        
       do
        {
         b=sc.nextInt();
        switch(b)
         {
            case 1:
                System.out.println("Nhap mang");
                nhap(n);
            break;
            case 2: 
                System.out.println("Mang vua nhap");
                xuat(a,n);
            break;
            case 3: add(a,n);
                System.out.println("Mang vua them vao");
            xuat(a,a.length);
            break;
            case 4:
                System.out.println("Nhap mang");
                nhap(n);
                xoa(a,n);
            xuat(a,n-1);
            break;
            case 5:
                System.out.println("Nhap mang");
                nhap(n);
                daonguoc(a,n);
                System.out.println("Mang vua dao nguoc");
            xuat(a,n);
            break;
            case 6:
                   nhap(n);
                   chia(a,n);
            break;
            case 7: System.exit(0);
            default: System.out.println("Nhap sai roi");
         }
        }
        while(b!=7);
        
        
    }
}
