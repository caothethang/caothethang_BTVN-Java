/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import QuanLi.DanhSach;
import QuanLi.Hang;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cao The Thang
 */
public class KhachHang {

    private String HoTen;
    private long ViTien;
    private DanhSach ListSP;
    ArrayList<Hang> Selected = new ArrayList<>();
    long TongTien;

    public KhachHang() {
    }

    public KhachHang(String HoTen, long ViTien) {
        this.HoTen = HoTen;
        this.ViTien = ViTien;
    }

    Scanner sc = new Scanner(System.in);

    public void add(DanhSach List) {
        ListSP = List;
    }

    public void Show() {

        ListSP.ShowGianHang();
        System.out.println("-------------------------------------------------");
    }

    public void AutoXoa() {
        ListSP.XoaHang();
    }

    public void Search() {
        int choose;
        do {
            System.out.println("--------------------------------");
            System.out.println("1.Tìm kiếm theo ID: ");
            System.out.println("--------------------------------");
            System.out.println("2.Tìm kiếm theo từ khóa: ");
            System.out.println("--------------------------------");
            System.out.println("3.Tìm kiếm theo giá: ");
            System.out.println("--------------------------------");
            System.out.println("4.Tìm kiếm theo ngày đăng: ");
            System.out.println("--------------------------------");
            System.out.println("5.Tìm kiếm theo loại hàng: ");
            System.out.println("--------------------------------");
            System.out.println("6.Thoát tìm kiếm.");
            System.out.println("--------------------------------");
            System.out.print("Your selection: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {

                case 1:
                    ListSP.HienThiSearchByIDs();
                    break;
                case 2:
                    ListSP.SearchByKeyWord();
                    break;
                case 3:
                    ListSP.SearchByGia();
                    break;
                case 4:
                    ListSP.SearchByTime();
                    break;
                case 5:
                    ListSP.SearchByLoaiHang();
                    break;
                case 6:
                    break;
            }
        } while (choose != 6);
    }

    public int SoLuong() {
        int n = sc.nextInt();
        return n;
    }
    int SoLuongMua;

    public void ChonHang() {
        System.out.println("--------------------------------");
        System.out.println("Nhập ID của mặt hàng bạn muốn mua: ");
        String id = sc.nextLine();
        Selected.add(ListSP.SearchByIDs(id));
        System.out.println("Nhập số lượng bạn muốn mua: ");
        SoLuongMua = SoLuong();
    }

    public void HoaDon() {
        System.out.println("--------------------------------");
        System.out.println("Những hàng bạn đã chọn mua: ");
        for (int i = 0; i < Selected.size(); i++) {
            Selected.get(i).setSoLuong(Selected.get(i).getSoLuong() - SoLuongMua);
            System.out.println("--------------------------------");
            Selected.get(i).HienThiThongTin();
            System.out.println("Số lượng đã mua: " + SoLuongMua);
        }
        TongTien = 0;
        for (int i = 0; i < Selected.size(); i++) {
            TongTien += Selected.get(i).getGia() * SoLuongMua;
        }
        System.out.println("--------------------------------");
        System.out.println("Tổng tiền bạn phải trả: " + TongTien);
        System.out.println("--------------------------------");
        if (ViTien >= TongTien) {
            System.out.println("--------------------------------");
            System.out.println("Đủ tiền thanh toán nha !!");
            Selected.clear();
        } else {
            System.out.println("--------------------------------");
            System.out.println("Thiếu tiền rồi ");
            System.out.println("--------------------------------");
            Selected.clear();
            System.out.println("Mời bạn chọn lại ");
        }
    }

    public void MuaHang() {
        int choose;
        do {
            System.out.println("--------------------------------");
            System.out.println("1.Chọn mua hàng: ");
            System.out.println("--------------------------------");
            System.out.println("2.In hóa đơn ");
            System.out.println("--------------------------------");
            System.out.println("3.Thoát");
            System.out.println("--------------------------------");
            System.out.println("Nhập lựa chọn của bạn ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    ChonHang();
                    break;
                case 2:
                    HoaDon();
                    break;
                case 3:
                    break;
            }
        } while (choose != 3);
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public long getViTien() {
        return ViTien;
    }

    public void setViTien(long ViTien) {
        this.ViTien = ViTien;
    }

    public ArrayList<Hang> getSelected() {
        return Selected;
    }

    public void setSelected(ArrayList<Hang> Selected) {
        this.Selected = Selected;
    }

    public void HienThiThongTin() {
        System.out.println("Tên: " + HoTen + "  Ví Tiền: " + ViTien);
    }

}
