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
public class Mon {
    private String MaMon;
    private String TenMon;
    private int SoTiet;

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }
    Scanner sc=new Scanner(System.in);
    public void InputMon(){
        System.out.println("Nhap ma mon:");
        MaMon=sc.nextLine();
        System.out.println("Nhap ten mon: ");
        TenMon=sc.nextLine();
        System.out.println("Nhap so tiet:");
        SoTiet=sc.nextInt();
    }
    public void OutputMon(){
        System.out.println("Ma mon:"+ MaMon);
        System.out.println("Ten mon: "+TenMon);
        System.out.println("So tiet: "+SoTiet);
    }
}
