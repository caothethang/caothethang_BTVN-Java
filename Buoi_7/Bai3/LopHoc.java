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
public class LopHoc {
    String MaLH;
    String TenLH;
    String NgayMo;
    Sinhvien[] x;
    int n;
    String GiaoVien;

    public LopHoc() {
    }

    public LopHoc(String MaLH, String TenLH, String NgayMo, Sinhvien[] x, int n, String GiaoVien) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.NgayMo = NgayMo;
        this.x = x;
        this.n = n;
        this.GiaoVien = GiaoVien;
    }
    public String getMaLH() {
        return MaLH;
    }
    public String getTenLH() {
        return TenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }
    public Sinhvien[] getX() {
        return x;
    }

    public void setX(Sinhvien[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }
     public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma LH: ");
        MaLH = scanner.nextLine();
        System.out.print("Ten Lh: ");
        TenLH = scanner.nextLine();
        System.out.print("Ngay mo: ");
        NgayMo = scanner.nextLine();
        System.out.print("Giáo viên: ");
        GiaoVien = scanner.nextLine();
        System.out.print("Nhập n sv: ");
        n = scanner.nextInt();
        x = new Sinhvien[n];
        for (int i = 0; i < n; i++) {
            x[i] = new Sinhvien();
            System.out.println("Sinh viên:"+(i + 1));
            x[i].nhap();
            x[i].Nhap();
        }
    }
    public void Output()
    {
        System.out.println("Ma lh:"+MaLH);
          System.out.println("Ten lh:"+TenLH);
            System.out.println("Ngay mo:"+NgayMo);
              System.out.println("So sinh vien:"+n);
        for(int i=0;i<n;i++)
        {
            x[i].xuat();
            x[i].Xuat();
        }
        
    }
}
