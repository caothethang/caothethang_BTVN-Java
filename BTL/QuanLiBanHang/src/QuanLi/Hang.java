/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

/**
 *
 * @author Cao The Thang
 */
public class Hang {

    private String ID;
    private String Name;
    private String LoaiHang;
    private long Gia;
    private String NgayDang;
    private int SoLuong;

    public Hang(String ID, String Name, String LoaiHang, long Gia, String NgayDang, int SoLuong) {
        this.ID = ID;
        this.Name = Name;
        this.LoaiHang = LoaiHang;
        this.Gia = Gia;
        this.NgayDang = NgayDang;
        this.SoLuong = SoLuong;
    }

    public Hang() {
    }

    public String getID() {
        return ID;
    }

    public String getLoaiHang() {
        return LoaiHang;
    }

    public void setLoaiHang(String LoaiHang) {
        this.LoaiHang = LoaiHang;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public String getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(String NgayDang) {
        this.NgayDang = NgayDang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void HienThiThongTin() {
        System.out.println("ID: " + ID + " Ten: " + Name + " Gia: " + Gia + "  Loại hàng: " + LoaiHang + " Ngày đăng: " + NgayDang + " SoLuong: " + SoLuong);
    }
}
