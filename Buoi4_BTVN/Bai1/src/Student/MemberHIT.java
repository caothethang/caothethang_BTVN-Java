/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MemberHIT {
    private Student a[];
    private int n;

    public Student[] getA() {
        return a;
    }

    public void setA(Student[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.println("Nhap so sinh vien:");
        n=sc.nextInt();
        a=new Student[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Student();
            a[i].InputStudent();
        }
       
    }
    public void Output(){
        for(int i=0;i<n;i++)
        {
            a[i].OutputStudent();
        }
    }
}
