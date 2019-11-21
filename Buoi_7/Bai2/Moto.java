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
public class Moto extends Vehicle {
    int PhanKhoi;
    public Moto(int PhanKhoi, String Nhanhieu, int NamSx, String Hang) {
        super(Nhanhieu, NamSx, Hang);
        this.PhanKhoi = PhanKhoi;
    }

    public int getPhanKhoi() {
        return PhanKhoi;
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
    public void Xuat()
    {
         System.out.println("Nhanhieu:"+getNhanhieu());
            System.out.println("Phan Khoi:"+getPhanKhoi());
              System.out.println("Nam sx:"+getNamSx());
                System.out.println("Hang xe:"+getHang());
    }
  
}
