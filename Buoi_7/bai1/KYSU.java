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
public class KYSU extends Person{
    private String Nganh;
    private int NamTN;

    public String getNganh() {
        return Nganh;
    }

    public int getNamTN() {
        return NamTN;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public String getQuequan() {
        return Quequan;
    }
    Scanner sc=new Scanner(System.in);
    void NHAP()
    {
        System.out.println("Nhap vao ten:");
        Hoten=sc.nextLine();
        System.out.println("Nhap vao ngay sinh:");
        Ngaysinh=sc.nextLine();
        System.out.println("Nhap vao que quan:");
        Quequan=sc.nextLine();
        System.out.println("Nhap vao nganh:");
        Nganh=sc.nextLine();
        System.out.println("Nhap vao nam tot nghiep:");
        NamTN=sc.nextInt();
    }
    void XUAT()
    {
        System.out.println("Ten:"+Hoten);
        System.out.println("Ngay sinh:"+Ngaysinh);
        System.out.println("Que quan:"+Quequan);
        System.out.println("Nganh:"+Nganh);
        System.out.println("Nam tot nghiep:"+NamTN);
    }
    
    
}
