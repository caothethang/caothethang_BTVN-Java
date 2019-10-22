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
public class Student {
    private String name;
    private String code;
    private int age;
    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten: ");
        name = sc.nextLine();
        System.out.print("Code: ");
        code =sc.nextLine();
        System.out.print("Tuoi: ");
        age = sc.nextInt();     
    }
    public void ShowInfo(){
        System.out.println("Ten hs:"+name+" "+"Code: "+code+" "+"Tuoi:"+age);
        
    }
    
}
