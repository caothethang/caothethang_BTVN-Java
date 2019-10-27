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
public class Bai2 {
 public  static void xuatmang(int[] a){
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
}
public static void sapxep(int[] a,int n){
    int temp;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
}
public static int soHoanHao(int x) {
        int tong=0;
        for(int i=1;i<x;i++)
        {
            if(x%i==0)
            {
                tong+=i;
            }
        }
    if(tong==x) return 1;
    else return 0;    
}
public static int min(int a[],int n){
    int min=a[0];
    int b = 0;
    for(int i=1;i<n;i++)
    {
        if(a[i]<min)
        {
            b=i;
        }
    }
    return b;
}
public static void chen(int a[],int x,int n){
    if(soHoanHao(x)==1){
        for(int i=min(a,n);i<n;i++){
            a[i+1]=a[i];
        }
        a[min(a,n)]=x;
    }
}
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n+1;
        int[] a=new int[n];
        System.out.println("Nhap mang:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sapxep(a,n);
        System.out.println("mang sau khi sap xep");
        xuatmang(a);
        System.out.println("Nhap so x");
        int x=sc.nextInt();
        if(soHoanHao(x)==0){
            System.out.println("Khong phai so hoan hao");
        }
        if(soHoanHao(x)==1) {
            chen(a,x,c);
            xuatmang(a);
        }
    }
}
