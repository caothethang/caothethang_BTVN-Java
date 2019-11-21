/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao n ky su:");
        int n=sc.nextInt();
        KYSU []kysu=new KYSU[n];
        for(int i=0;i<n;i++)
        {
            kysu[i]=new KYSU();
                    
            System.out.println("Ki su thu "+(i+1));
            kysu[i].NHAP();
            kysu[i].XUAT();
        }
        int max=kysu[0].getNamTN();
        for(int i=0;i<n;i++)
        {
            if(kysu[i].getNamTN()>max) max=kysu[i].getNamTN();
        }
        System.out.println("Thong tin ky su tot nghiep nam gan nhat:");
        for(int i=0;i<n;i++)
        {
            if(kysu[i].getNamTN()==max) kysu[i].XUAT();
        }
        
    }
   
}
