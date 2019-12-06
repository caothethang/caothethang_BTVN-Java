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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           Hacker Hacker1=new Hacker();
           Hacker Hacker2=new Hacker("Thang", 2000, "Vinh Phuc", "Football");
        System.out.println("Nhap ten hacker1: ");
            Hacker1.setName(sc.nextLine());
        System.out.println("Nhap dia chi hacker1: ");
            Hacker1.setAddress(sc.nextLine());
        System.out.println("Nhap so thich hacker1: ");
            Hacker1.setHobby(sc.nextLine());
        System.out.println("Nhap nam sinh hacker1: ");
            Hacker1.setNamSinh(sc.nextInt());
        System.out.println("ten hacker1: "+Hacker1.getName());
        System.out.println("Nhap dia chi hacker1: "+Hacker1.getAddress());
        System.out.println(" so thich hacker1: "+Hacker1.getHobby());
        System.out.println("Nhap nam sinh hacker1: "+Hacker1.getNamSinh());
        System.out.println("Thong tin hacker2 :");
        Hacker2.HienThiThongTin();
        Hacker ds=new Hacker();
         ds.setN(sc.nextInt());
         sc.nextLine();
         ds.DSHacker();
         System.out.println("Cac hacker 18 tuoi");
         ds.Hacker18();
         System.out.println("Cac hacker chu t: ");
         ds.HackerT();

    }
}
