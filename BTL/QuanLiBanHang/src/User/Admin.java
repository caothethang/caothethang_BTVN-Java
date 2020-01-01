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
public class Admin {

    private String HoTen;
    private long ViTien;
    private DanhSach ListSP;
    private KhachHang Customer;
    Scanner sc = new Scanner(System.in);

    public void add(DanhSach List) {
        ListSP = List;
    }

    public void XoaHang() {
        System.out.println("-----Nhập vào ID mặt hàng bạn muốn xóa:  --------");
        String id = sc.nextLine();
        for (int i = 0; i < ListSP.getListHang().size(); i++) {
            if (ListSP.getListHang().get(i).getID().compareTo(id) == 0) {
                ListSP.getListHang().remove(i);
            }
        }
    }
    public void AutoXoa()
    {
        ListSP.XoaHang();
    }

    public void Search() {
        int choose;
        do {
            System.out.println("1.Tìm kiếm theo ID: ");
            System.out.println("2.Tìm kiếm theo từ khóa: ");
            System.out.println("3.Tìm kiếm theo giá: ");
            System.out.println("4.Tìm kiếm theo ngày đăng: ");
            System.out.println("5.Tìm kiếm theo loại hàng: ");
            System.out.println("6.Thoát tìm kiếm.");
            System.out.println("                                                                       ");
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

    public void Show() {
        
        ListSP.ShowGianHang();
        System.out.println("                                                                       ");
    }

    public void ThemSanPhamMoi(DanhSach List) {
        Hang a = new Hang();

        boolean CHECK = true;
        do {
            System.out.println("Nhập ID cho sản phẩm mới: ");
            a.setID(sc.nextLine());
            for (int i = 0; i < List.getListHang().size(); i++) {
                //   System.out.println(List.getListHang().get(i).getID());
                if (a.getID().compareTo(List.getListHang().get(i).getID()) == 0) {
                    CHECK = false;
                    break;
                } else {
                    CHECK = true;
                }
            }
            if (CHECK == true) {
                System.out.println("Nhập tên cho sản phẩm mới: ");
                a.setName(sc.nextLine());
                System.out.println("Nhập loại hàng cho sản phẩm mới: ");
                a.setLoaiHang(sc.nextLine());
                System.out.println("Nhập giá cho sản phẩm mới: ");
                a.setGia(sc.nextLong());
                sc.nextLine();
                System.out.println("Nhập số lượng cho sản phẩm mới: ");
                a.setSoLuong(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập ngày đăng cho sản phẩm: ");
                a.setNgayDang(sc.nextLine());
                List.Add(a);
            } else {
                System.out.println("Đã tồn tại ID này, yêu cầu nhập ID mới: ");
            }
        } while (CHECK == false);

    }

    public void ChangeInfor() {
        System.out.println("Nhập ID :");
        String id = sc.nextLine();
        System.out.println("Nhập lựa chọn: ");
        int choose;
        do {
            System.out.println("1.Thay đổi ID: ");
            System.out.println("2.Thay đổi tên hàng: ");
            System.out.println("3.Thay đổi loại hàng: ");
            System.out.println("4.Thay đổi giá: ");
            System.out.println("5.Thay đổi ngày đăng: ");
            System.out.println("6.Thay đổi số lượng: ");
            System.out.println("7.Thoát: ");
            System.out.println("                                                                       ");
            System.out.println("-------------Lựa chọn của bạn:--------------------");
            System.out.print("Your selection: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {

                case 1:
                    System.out.println("Thay đổi ID thành: ");
                    ListSP.SearchByIDs(id).setID(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Thay đổi tên hàng thành: ");
                    ListSP.SearchByIDs(id).setName(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Thay đổi loại hàng thành: ");
                    ListSP.SearchByIDs(id).setLoaiHang(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Thay đổi giá thành: ");
                    ListSP.SearchByIDs(id).setGia(sc.nextLong());
                    break;
                case 5:
                    System.out.println("Thay đổi ngày đăng thành: ");
                    ListSP.SearchByIDs(id).setNgayDang(sc.nextLine());
                    break;
                case 6:
                    System.out.println("Thay đổi số lượng thành: ");
                    ListSP.SearchByIDs(id).setSoLuong(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Thoát:");
                    break;
            }
        } while (choose != 7);
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

}
