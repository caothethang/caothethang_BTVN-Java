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
public class main {
    public static void main(String[] args) {
        LopHoc KTPM=new LopHoc();
        System.out.println("-----------Nhập thông tin lớp học:-------");
        KTPM.Input();
        System.out.println("------------Thong tin lop học:------------------^");
        KTPM.Output();
    
    int dem=0;
    for(int i=0;i<KTPM.getN();i++)
    {
        if(KTPM.getX()[i].getKhoaHoc()==11) dem++;
    }
        System.out.println("Co "+dem+" sv khoa 11");
        System.out.println("------------Sx tang dan----------:");
    for(int i=0;i<KTPM.getN()-1;i++)
    {
        for(int j=i+1;j<KTPM.getN();j++)
        {
            if(KTPM.getX()[i].getKhoaHoc()>KTPM.getX()[j].getKhoaHoc())
            {
                Sinhvien temp=KTPM.getX()[j];
                KTPM.getX()[j]=KTPM.getX()[i];
                KTPM.getX()[i]=temp;
            }
        }
    }
    KTPM.Output();
}
}
