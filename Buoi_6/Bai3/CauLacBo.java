/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Administrator
 */
public class CauLacBo {
    private Leader A;
    private Support B;
    private Member C;

    public CauLacBo(Leader A, Support B, Member C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public void ShowInfoClass(){
        A.ShowInfo();
        B.ShowInfo();
        C.ShowInfo();
    }
}
