/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BTVN {

    /**
     * @param args the command line arguments
     */
static int TinhTong(int a,int b,int c){
        return a+b+c;
    }
static float TinhTheoCongThuc(int a,int b,int c){
    return ((float)(a/b)-c)/2;
}
static int ChuyenThanhString(int a,int b,int c){
    String abc=Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
    return Integer.parseInt(abc);
}
static void HienThiHam(int a,int b,int c)
{
    System.out.println(TinhTong(a,b,c));
    System.out.println(TinhTheoCongThuc(a, b, c));
    System.out.println(String.valueOf(ChuyenThanhString(a, b, c)));
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        HienThiHam(a, b, c);
        
    }
}
