/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {
    private String MSV;
    private String ten;
    private int age;
    private String lop;
    public void InputStudent() {
         Scanner sc=new Scanner(System.in);
         System.out.println("Nhap ma SV");
         MSV=sc.nextLine();
         System.out.println("Nhap ten SV");
         ten=sc.nextLine();
         System.out.println("Nhap tuoi");
         age=sc.nextInt();
         sc.nextLine();
         System.out.println("Nhap lop");
         lop=sc.nextLine();
}
    public void OutputStudent(){
        System.out.println("Ma sinh vien:" +MSV);
        System.out.println("Ten:" +ten);
        System.out.println("Tuoi:" +age);
        System.out.println("Lop:" +lop);
    }
}
