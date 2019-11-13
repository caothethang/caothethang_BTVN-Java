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
public class Leader {
    private String name;
    private int age;
    private int Days;

    public Leader(String name, int age, int Days) {
        this.name = name;
        this.age = age;
        this.Days = Days;
    }
    public void ShowInfo(){
      System.out.println("Ten:"+name);
      System.out.println("Số ngày lãnh đạo:"+Days);
      System.out.println("Tuổi:"+age);
}
}
