/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BattleField {
      private String name;

    public String getName() {
        return name;
    }
    private int HP;

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }
    public int getDamage() {
        return Damage;
    }
    private int Damage;
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten:");
        name=sc.nextLine();
        System.out.println("HP:");
        HP=sc.nextInt();
        System.out.println("Sat thuong:");
        Damage=sc.nextInt();
    }
    public void Output(){
        System.out.println("TEN: "+name);
        System.out.println("HP: "+HP);
        System.out.println("Sat thuong: "+Damage);
    }
    public void Attack(BattleField P1){
        P1.setHP(P1.getHP()-this.getDamage());
    }
}
