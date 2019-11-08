/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaClass {
    private Student stdList[];
    private int ratingStar;
    int n;
    String leaDer;
    Scanner sc=new Scanner(System.in);
    private void InputStudent(){  
        System.out.println("Nhap so hoc sinh");
        n=sc.nextInt();
        sc.nextLine();
        stdList=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Hoc sinh thu "+ (i+1));
            stdList[i]=new Student();
            stdList[i].InputInfo();
        }
    }
    private void ShowStudent(){
        for(int i=0;i<n;i++){
            stdList[i].ShowInfo();
        }
    }
    public void InputClassInfo(){
        System.out.println("Nhap ten leader");
        leaDer=sc.nextLine();
        System.out.println("Nhap rating star");
        ratingStar=sc.nextInt();
        InputStudent();
    }
    public void ShowClassInfo(){
        System.out.println("Ten leader: "+leaDer);
        System.out.println("rating star: "+ratingStar);
        ShowStudent();
    }
}
