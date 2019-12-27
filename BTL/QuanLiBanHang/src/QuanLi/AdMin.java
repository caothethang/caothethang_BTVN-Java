/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import java.util.ArrayList;

/**
 *
 * @author Cao The Thang
 */
public class AdMin extends DanhSach{
    public void XoaHang(ArrayList<Hang> a)
    {
        a=this.ListHang;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).getSoLuong()==0)
            {
                a.remove(i);
            }
        }
    }
}
