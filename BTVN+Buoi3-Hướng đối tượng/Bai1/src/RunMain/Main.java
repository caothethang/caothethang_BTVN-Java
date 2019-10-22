/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunMain;
import common.Person;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person Tanjiro=new Person();
        Tanjiro.setName(sc.nextLine());
        Tanjiro.setAge(sc.nextInt());
        sc.nextLine();
        Tanjiro.setHobby(sc.nextLine());
        Tanjiro.setSex(sc.nextLine());
       
        Person Zenitsu=new Person();
        Zenitsu.setName(sc.nextLine());
        Zenitsu.setAge(sc.nextInt());
        sc.nextLine();
        Zenitsu.setHobby(sc.nextLine());
        Zenitsu.setSex(sc.nextLine());
        System.out.println(Tanjiro.getName()+"\n"+Tanjiro.getAge()+"\n"+Tanjiro.getHobby()+"\n"+Tanjiro.getSex());
        System.out.println(Zenitsu.getName()+"\n"+Zenitsu.getAge()+"\n"+Zenitsu.getHobby()+"\n"+Zenitsu.getSex());        
    }
}