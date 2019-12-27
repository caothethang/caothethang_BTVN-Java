/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cao The Thang
 */
public class DanhSach extends Hang{
    Scanner sc=new Scanner(System.in);
    ArrayList<Hang> ListHang=new ArrayList<>();
    public void Add(Hang a)
    {
        ListHang.add(a);
    }
    ArrayList<Hang> SearchByKeyWord(String Key)
    {
        ArrayList<Hang> Result=new ArrayList<>();
        for(int i=0;i<ListHang.size();i++)
        {
            if(ListHang.get(i).getName().contains(Key))
            {
                Result.add(ListHang.get(i));
            }
        }
        return Result;
    }
    public void SearchByKeyWord()
    {
        System.out.println("Nhập tên cần tìm: ");
        String key=sc.nextLine();
        ArrayList<Hang> result=SearchByKeyWord(key);
        if(result != null)
        {
            for(Hang a : result){
                a.HienThiThongTin();
            }
        }
    }
     ArrayList<Hang> SearchByID(String ID)
    {
        ArrayList<Hang> Result=new ArrayList<>();
        for(int i=0;i<ListHang.size();i++)
        {
            if(ListHang.get(i).getID()==ID)
            {
                Result.add(ListHang.get(i));
            }
        }
        return Result;
    }
    public void SearchByID()
    {
        System.out.println("Nhập ID sản phẩm cần tìm: ");
        String id=sc.nextLine();
        ArrayList<Hang> result=SearchByKeyWord(id);
        if(result != null)
        {
            for(Hang a : result){
                a.HienThiThongTin();
            }
        }
    }
     ArrayList<Hang> SearchByLoaiHang(String Loai)
    {
        ArrayList<Hang> Result=new ArrayList<>();
        for(int i=0;i<ListHang.size();i++)
        {
            if(ListHang.get(i).getName().contains(Loai))
            {
                Result.add(ListHang.get(i));
            }
        }
        return Result;
    }
    public void SearchByLoaiHang()
    {
        System.out.println("Nhập loại hàng cần tìm: ");
        String loai=sc.nextLine();
        ArrayList<Hang> result=SearchByLoaiHang(loai);
        if(result != null)
        {
            for(Hang a : result){
                a.HienThiThongTin();
            }
        }
    }
     ArrayList<Hang> SearchByGia(long cost1,long cost2)
    {
        ArrayList<Hang> Result=new ArrayList<>();
        for(int i=0;i<ListHang.size();i++)
        {
            if(ListHang.get(i).getGia()>=cost1 && ListHang.get(i).getGia()<=cost2)
            {
                Result.add(ListHang.get(i));
            }
        }
        return Result;
    }
    public void SearchByGia()
    {
        System.out.println("Nhập khoảng giá cần tìm: ");
        System.out.println("Khởi đầu :");
        long cost1=sc.nextLong();
        System.out.println("Kết thúc: ");
        long cost2=sc.nextLong();
        sc.nextLine();
        ArrayList<Hang> result=SearchByGia(cost1,cost2);
        if(result != null)
        {
            for(Hang a : result){
                a.HienThiThongTin();
            }
        }
    }
     ArrayList<Hang> SearchByTime(String Time)
    {
        ArrayList<Hang> Result=new ArrayList<>();
        for(int i=0;i<ListHang.size();i++)
        {
            if(ListHang.get(i).getNgayDang()==Time)
            {
                Result.add(ListHang.get(i));
            }
        }
        return Result;
    }
    public void SearchByTime()
    {
        System.out.println("Nhập thời gian đăng sản phẩm: ");
        String time=sc.nextLine();
        ArrayList<Hang> result=SearchByTime(time);
        if(result != null)
        {
            for(Hang a : result){
                a.HienThiThongTin();
            }
        }
    }
    public void ShowGianHang()
    {
        System.out.println("Gian hàng của bạn có: ");
        for(Hang a : ListHang)
        {
            a.HienThiThongTin();
        }
    }
}
