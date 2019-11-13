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
public class Main {
    public static void main(String[] args) {
        MayTinh x=new MayTinh();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tham so:");
        System.out.println("Nhap a:");
        float a=sc.nextFloat();
        System.out.println("Nhap b:");
        float b=sc.nextFloat();
        System.out.println("Nhap c:");
        float c=sc.nextFloat();
        System.out.println("Nhap so phan tu mang:");
        int n=sc.nextInt();
        float d[]=new float[n];
        System.out.println("Nhap phan tu mang");
        for(int i=0;i<n;i++)
        {
            d[i]=sc.nextInt();
        }
        System.out.println("Tong mang:");
        System.out.println(x.TinhTong(d));
        System.out.println("Tong 2 so:");
        System.out.println(x.TinhTong(a, b));
        System.out.println("Tong 3 so");
        System.out.println(x.TinhTong(a, b, c));
    }
}
