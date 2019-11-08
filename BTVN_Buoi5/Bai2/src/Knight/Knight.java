/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Knight;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Knight {
    private String name;
    private int HP;
    private int MP;

    public int getMP() {
        return MP;
    }
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten:");
        name=sc.nextLine();
        System.out.println("Nhap HP:");
        HP=sc.nextInt();
        System.out.println("Nhap MP:");
        MP=sc.nextInt();
    }
    public void Output(){
        System.out.println("Ten: " +name);
        System.out.println("HP: " +HP);
        System.out.println("MP: "+MP);
    }
    public void Skill(){
        if(MP>=50){
            MP-=50;
            HP+=30;
        }
    }
}
