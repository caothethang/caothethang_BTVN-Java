/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class ConHeo {
   private String ten;
   private int weight;
   private int age;

    public ConHeo(String ten, int weight, int age) {
        this.ten = ten;
        this.weight = weight;
        this.age = age;
    }
  public void ShowInfo(){
      System.out.println("Ten:"+ten);
      System.out.println("Cân nặng:"+weight);
      System.out.println("Tuổi:"+age);
  }
    
}
