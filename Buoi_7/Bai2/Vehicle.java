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
public class Vehicle {
    String Nhanhieu;
    int NamSx;
    String Hang;

    public String getNhanhieu() {
        return Nhanhieu;
    }

    public void setNhanhieu(String Nhanhieu) {
        this.Nhanhieu = Nhanhieu;
    }

    public int getNamSx() {
        return NamSx;
    }

    public void setNamSx(int NamSx) {
        this.NamSx = NamSx;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public Vehicle(String Nhanhieu, int NamSx, String Hang) {
        this.Nhanhieu = Nhanhieu;
        this.NamSx = NamSx;
        this.Hang = Hang;
    }
    
}
