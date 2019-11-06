/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import QuanLi.Quanli;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Quanli quanli=new Quanli();
        quanli.Input();
        quanli.Output();
        for(int i=0;i<quanli.getN();i++){
            if(quanli.getA()[i].getSoTietNghi()>=(quanli.getMon().getSoTiet())/3){
                
                System.out.println(quanli.getA()[i].getTenSV()+ " Nghi cmm hoc di");
            }
            else{
                System.out.println(quanli.getA()[i].getTenSV()+ " đi học tiếp đi em");
            }
        }
        // TODO code application ;logic here
    }
    
}
