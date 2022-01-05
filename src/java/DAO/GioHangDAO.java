/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.SanPham;
import java.util.ArrayList;

/**
 *
 * @author Minh Nguyen
 */
public class GioHangDAO extends DAO {
    
    public GioHangDAO() {
    }
    
    public ArrayList<SanPham> getDanhSachSanPham(int idKhachHang) {
        ArrayList<SanPham> result = new ArrayList<>();

        return result;
    }
    
    public boolean ThemGioHang(SanPham sp) {
        return true;
    }
    
    public boolean XoaGioHang(int id) {
        return true;
    }
}
