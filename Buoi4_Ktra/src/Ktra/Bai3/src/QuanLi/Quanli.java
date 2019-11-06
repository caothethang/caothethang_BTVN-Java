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
public class Quanli {
    private Mon mon;
    private SinhVien []a;

    public Mon getMon() {
        return mon;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    public SinhVien[] getA() {
        return a;
    }

    public void setA(SinhVien[] a) {
        this.a = a;
    }
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        mon=new Mon();
        mon.InputMon();
        System.out.println("Nhap so sinh vien:");
        n=sc.nextInt();
        sc.nextLine();
        a=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new SinhVien();
            System.out.println("Sinh vien thu "+(i+1));
            a[i].InputSV();
        }
    }
    public void Output(){
        mon.OutputMon();
        for(int i=0;i<n;i++){
            a[i].OutputSV();
        }
    }
    
    
}
