/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Min là: "+  Math.min(Math.min(a,b),Math.min(b,c)));
        System.out.println("Max là: " + Math.max(Math.max(a,b),Math.max(b,c)));
    }
    
}
