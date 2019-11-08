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
        do{
            P1.Attack(P2);
            P2.Attack(P1);
            P1.Output();
            P2.Output();
              if(P1.getHP()<=0) System.out.println(P1.getName()+" THUA");
            else System.out.println(P2.getName()+" THUA");
        }
        while(P1.getHP()>0 && P2.getHP()>0);
       
    }
    
}
