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
public class Support {
     private String name;
     private int age;
     private String []tentv;

    public Support(String name, int age, String[] tentv) {
        this.name = name;
        this.age = age;
        this.tentv = tentv;
    }
    public void ShowInfo(){
        System.out.println("Ten sp:"+name);
        System.out.println("Tuoi sp:"+age);
        for(int i=0;i<tentv.length;i++){
            System.out.println("Ten tv trong nhom:"+tentv[i]);
        }
    }
     
     
}
