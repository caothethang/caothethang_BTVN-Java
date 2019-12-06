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
public class Hacker {
    private String name;
    private int NamSinh;
    private String Address;
    private String Hobby;
    private int n;
    private Hacker a[];
    Scanner scanner=new Scanner(System.in);
    public Hacker() {
        
    }
    public void DSHacker()
    {
        System.out.println("Nhap so hacker: ");
        n=scanner.nextInt();
        scanner.nextLine();
        a=new Hacker[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Hacker();
            System.out.println("Nhập hacker " + (i + 1));
            System.out.println("Nhập tên: ");
            a[i].setName(scanner.nextLine());
            System.out.println("Nhập năm sinh: ");
            a[i].setNamSinh(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập địa chỉ: ");
            a[i].setAddress(scanner.nextLine());
            System.out.println("Nhập sở thích: ");
            a[i].setHobby(scanner.nextLine());
        }
    }
    

    public Hacker(String name, int NamSinh, String Address, String Hobby) {
        this.name = name;
        this.NamSinh = NamSinh;
        this.Address = Address;
        this.Hobby = Hobby;
    }
     public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String Hobby) {
        this.Hobby = Hobby;
    }
    public void HienThiThongTin()
    {
        System.out.println("Ten: "+name);
        System.out.println("NamSinh: "+NamSinh);
        System.out.println("Địa chỉ: "+Address);
        System.out.println("Sở thích: "+Hobby);
    }
    public void Hacker18()
    {
        for(int i=0;i<n;i++)
        {
            if(a[i].getNamSinh()==2001)
            {
                System.out.println("Ten: "+a[i].getName());
            System.out.println("NamSinh: "+a[i].getNamSinh());
            System.out.println("Địa chỉ: "+a[i].getAddress());
            System.out.println("Sở thích: "+a[i].getHobby());
            }
        }
    }
    public void HackerT()
    {
         for(int i=0;i<n;i++)
         {
             if(a[i].getName().charAt(0)=='T' || a[i].getName().charAt(0)=='t' )
            {
            System.out.println("Ten: "+a[i].getName());
            System.out.println("NamSinh: "+a[i].getNamSinh());
            System.out.println("Địa chỉ: "+a[i].getAddress());
            System.out.println("Sở thích: "+a[i].getHobby());
            }
         }
    }
    
    
}
