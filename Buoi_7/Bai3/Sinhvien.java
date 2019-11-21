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
public class Sinhvien extends Nguoi {
    String MaSv;
    String Nganh;
    int KhoaHoc;

    public Sinhvien() {
    }

    public Sinhvien(String MaSv, String Nganh, int KhoaHoc) {
        this.MaSv = MaSv;
        this.Nganh = Nganh;
        this.KhoaHoc = KhoaHoc;
    }
    
    public void nhap()
    {
        System.out.println("Ma Sv:");
        MaSv=sc.nextLine();
        System.out.println("Nhap nganh:");
        Nganh=sc.nextLine();
        System.out.println("Nhap khoa hoc:");
        KhoaHoc=sc.nextInt();
        sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("Ma Sv:"+MaSv);
        System.out.println("Nhap nganh:"+Nganh);
        System.out.println("Nhap khoa hoc:"+KhoaHoc);
    }
    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(int KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
}
