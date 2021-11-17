/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.HangNhap;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Minh Nguyen
 */
public class HangNhapDAO {
    public HangNhapDAO(){}
    
    public ArrayList<HangNhap> getDanhSachHangNhap(Date TuNgay, Date DenNgay, String idNhanVien) {
        ArrayList<HangNhap> result = new ArrayList<>();

        return result;
    }
    
    public boolean NhapHang(int idSanPham, int SoLuong, int idNhanVienKho) {
        return true;
    }
    
    public boolean XoaHangNhap(int id) {
        return true;
    }
}
