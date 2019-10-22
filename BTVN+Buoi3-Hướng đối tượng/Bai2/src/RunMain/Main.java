/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunMain;

import Dog.Dog;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Dog abc=new Dog();
        abc.InputName(sc.nextLine());
        abc.Bark(abc.getName());
        abc.ShowMP();
        abc.Bark(abc.getName());
        abc.ShowMP();
        abc.Bark(abc.getName());
        abc.ShowMP();
    }
    
}
