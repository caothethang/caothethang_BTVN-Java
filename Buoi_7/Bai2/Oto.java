/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Administrator
 */
public class Oto extends Vehicle {
    int SochoNgoi;
    int Dungtich;
    public Oto(int SochoNgoi, int Dungtich, String Nhanhieu, int NamSx, String Hang) {
        super(Nhanhieu, NamSx, Hang);
        this.SochoNgoi = SochoNgoi;
        this.Dungtich = Dungtich;
    }
    public int getSochoNgoi() {
        return SochoNgoi;
    }

    public void setSochoNgoi(int SochoNgoi) {
        this.SochoNgoi = SochoNgoi;
    }

    public int getDungtich() {
        return Dungtich;
    }

    @Override
    public String getNhanhieu() {
        return Nhanhieu;
    }

    @Override
    public int getNamSx() {
        return NamSx;
    }

    @Override
    public String getHang() {
        return Hang;
    }

    public void setDungtich(int Dungtich) {
        this.Dungtich = Dungtich;
    }
    public void Xuat()
    {
        System.out.println("Nhanhieu:"+getNhanhieu());
          System.out.println("Duntich:"+getDungtich());
            System.out.println("So cho ngoi:"+getSochoNgoi());
              System.out.println("Nam sx:"+getNamSx());
                System.out.println("Hang xe:"+getHang());
    }
    
}
