/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Moto a=new Moto(100,"Wave",2000,"Honda");
        Oto b=new Oto(4,500,"CX5",2001,"Mazda");
        System.out.println("Thong tin mo to: ");
        a.Xuat();
        System.out.println("Thong tin o to:");
        b.Xuat();
    }
}
