/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunMain;

import Person.MemberHit;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        MemberHit P1=new MemberHit();
        MemberHit P2=new MemberHit();
        System.out.println("Thong tin P1:");
        P1.Input();
        P1.Output();
        System.out.println("Thong tin P2");
        P2.Input();
        P2.Output();
        for(int i=0;i<4;i++)
        {
            P1.Attack(P2);
            P2.Output();
        }
        for(int i=0;i<5;i++)
        {
            P2.Attack(P1);
            P1.Output();
        }
        if(P1.getHP()>P2.getHP()) System.out.println(P1.getName()+" thang");
        else System.out.println(P2.getName()+" thang");
    }
}
