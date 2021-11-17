/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TKSanPham;
import java.util.ArrayList;
import java.util.Date;

public class TKSanPhamDAO extends DAO{

    public TKSanPhamDAO() {
    }
    
    public ArrayList<TKSanPham> getDoanhThuSanPham(Date ngayBatDau, Date ngayKetThuc) {
        ArrayList<TKSanPham> result = new ArrayList<>();
        
        return result;
    }
    
    public ArrayList<TKSanPham> getThongKe(Date ngayBatDau, Date ngayKetThuc, int idSanPham) {
        ArrayList<TKSanPham> result = new ArrayList<>();
        
        return result;
    }
}
