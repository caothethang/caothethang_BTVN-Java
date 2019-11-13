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
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tvien:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten cac tvien cua suppor:");
        String []name=new String[n];
        for(int i=0;i<n;i++){
            name[i]=sc.nextLine();
        }
        CauLacBo a=new CauLacBo(new Leader("A Son",20,15),new Support("A Thụ",20,name),new Member("Trungpro",30,1));
        a.ShowInfoClass();
    
}
}    
