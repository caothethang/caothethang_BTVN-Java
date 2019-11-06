    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String TenSV;

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }
    private String MaSV;
    private String SDT;
    private int SoTietNghi;

    public int getSoTietNghi() {
        return SoTietNghi;
    }

    public void setSoTietNghi(int SoTietNghi) {
        this.SoTietNghi = SoTietNghi;
    }
    Scanner sc=new Scanner(System.in);
    public void InputSV() {
       
        System.out.println("Nhap ten SV");
        TenSV=sc.nextLine();
        System.out.println("Nhap ma SV");
        MaSV=sc.nextLine();
        System.out.println("Nhap so dt");
        SDT=sc.nextLine();
        System.out.println("Nhap so tiet nghi");
        SoTietNghi=sc.nextInt();
    }
    public void OutputSV()
    {
        System.out.println("Ten SV:"+ TenSV);
        System.out.println("Ma SV:" +MaSV);
        System.out.println("SDT: "+SDT);
        System.out.println("So tiet nghi: "+SoTietNghi);
    }
}
