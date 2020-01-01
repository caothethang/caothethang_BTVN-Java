/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunMain;

import User.Admin;
import QuanLi.DanhSach;
import QuanLi.Hang;
import User.KhachHang;
import java.util.Scanner;

/**
 *
 * @author Cao The Thang
 */
public class RunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin thang = new Admin();
        Hang hang1 = new Hang("1", "a", "dienthoai", 100, "1/1/2000", 10);
        Hang hang2 = new Hang("2", "b", "dienthoai1", 200, "2/1/2000", 20);
        Hang hang3 = new Hang("3", "c", "dienthoai2", 300, "3/1/2000", 30);
        Hang hang4 = new Hang("4", "d", "dienthoai3", 400, "4/1/2000", 40);
        Hang hang5 = new Hang("5", "e", "dienthoai4", 500, "5/1/2000", 0);
        DanhSach ShopVip = new DanhSach();
        ShopVip.Add(hang1);
        ShopVip.Add(hang2);
        ShopVip.Add(hang3);
        ShopVip.Add(hang4);
        ShopVip.Add(hang5);
        System.out.println("Nhập tài khoản: ");
        String taikhoan = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Nhập mật khẩu:");
        System.out.println("--------------------------------");
        String matkhau = sc.nextLine();
        if (taikhoan.compareTo("admin") == 0 && matkhau.compareTo("admin") == 0) {
            thang.add(ShopVip);

            System.out.println("---------------Đây là giao diện và chức năng của admin----------------");
            System.out.println("--------------------------------");
            int choose;
            do {
                thang.AutoXoa();
                System.out.println("---------------Lựa chọn của bạn------------------");
                System.out.println("--------------------------------");
                System.out.println("1.Hiển thị toàn bộ sản phẩm: ");
                System.out.println("--------------------------------");
                System.out.println("2.Tìm kiếm sản phẩm: ");
                System.out.println("--------------------------------");
                System.out.println("3.Thêm sản phẩm:  ");
                System.out.println("--------------------------------");
                System.out.println("4.Xóa sản phẩm: ");
                System.out.println("--------------------------------");
                System.out.println("5.Chỉnh sửa sản phẩm: ");
                System.out.println("--------------------------------");
                System.out.println("6.In hóa đơn: ");
                System.out.println("--------------------------------");
                System.out.println("7.Thoát:  ");
                System.out.println("--------------------------------");
                System.out.print("Your selection: ");
                choose = sc.nextInt();
                sc.nextLine();
                System.out.println("--------------------------------");
                switch (choose) {
                    case 1:
                        thang.Show();
                        break;
                    case 2:
                        thang.Search();
                        break;
                    case 3:
                        thang.ThemSanPhamMoi(ShopVip);
                        break;
                    case 4:
                        thang.XoaHang();
                        break;
                    case 5:
                        thang.ChangeInfor();
                        break;

                }
            } while (choose != 7);
        }

        KhachHang thangdeptrai = new KhachHang("thang", 1000);
        if (taikhoan.compareTo("admin") != 0) {
            System.out.println("---------------Đây là giao diện và chức năng của khách hàng----------------");
            System.out.println("--------------------------------");
            thangdeptrai.add(ShopVip);
            int choose;
            do {
                thangdeptrai.AutoXoa();
                System.out.println("--------------------------------");
                System.out.println("1.Xem các mặt hàng: ");
                System.out.println("--------------------------------");
                System.out.println("2.Tìm kiếm hàng: ");
                System.out.println("--------------------------------");
                System.out.println("3.Mua hàng ");
                System.out.println("--------------------------------");
                System.out.println("4.In hóa đơn ");
                System.out.println("--------------------------------");
                System.out.println("5.Thoát.");
                System.out.println("--------------------------------");

                System.out.println("Your selection: ");
                choose = sc.nextInt();
                sc.nextLine();
                switch (choose) {
                    case 1:
                        thangdeptrai.Show();
                        break;
                    case 2:
                        thangdeptrai.Search();
                        break;
                    case 3:
                        thangdeptrai.MuaHang();
                        break;
                    case 4:
                        thangdeptrai.HoaDon();
                        break;
                    case 5:
                        break;
                }
            } while (choose != 5);
        }
    }

}
