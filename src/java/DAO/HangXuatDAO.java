/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.HangXuat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Minh Nguyen
 */
public class HangXuatDAO extends DAO {
    public HangXuatDAO(){}
    
    public ArrayList<HangXuat> getDanhSachHangHangXuat(Date TuNgay, Date DenNgay, String idNhanVien, String idKhachHang) {
        ArrayList<HangXuat> result = new ArrayList<>();

        return result;
    }
    
    public boolean XuatHang(int idSanPham, int SoLuong, int idNhanVienKho) {
        return true;
    }
    
    public boolean XoaHangXuat(int id) {
        return true;
    }
}
