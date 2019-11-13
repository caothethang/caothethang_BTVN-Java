/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Administrator
 */
public class Member {
    private String ten;
    private int Days;
    private int Nghi;

    public Member(String ten, int Days, int Nghi) {
        this.ten = ten;
        this.Days = Days;
        this.Nghi = Nghi;
    }
                 
    public void ShowInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Số ngày hđ: " +Days);
        System.out.println("Số ngày nghỉ : " + Nghi);
}
}
