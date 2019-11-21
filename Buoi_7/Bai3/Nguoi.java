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
public class Nguoi {
    String Hoten;
    String NgaySinh;
    String QueQuan;
    Scanner sc=new Scanner(System.in);
    public void Nhap()
    {
        System.out.println("Nhap ho ten:");
        Hoten=sc.nextLine();
        System.out.println("Nhap Ngaysinh:");
        NgaySinh=sc.nextLine();
        System.out.println("Nhap que quan:");
        QueQuan=sc.nextLine();
    }
    public void Xuat()
    {
        System.out.println(" ho ten:"+Hoten);
        
        System.out.println(" Ngaysinh:"+NgaySinh);
        
        System.out.println(" que quan:"+QueQuan);

    }
}
