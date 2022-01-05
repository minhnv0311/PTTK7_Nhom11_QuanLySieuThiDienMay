/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.LoaiSanPham;
import Model.NhaCungCap;
import Model.SanPham;
import java.util.ArrayList;

/**
 *
 * @author Bui Quang Dam
 */
public class SanPhamDAO extends DAO {

    public SanPhamDAO() {
    }
    
    public ArrayList<SanPham> getDanhSachSanPham(NhaCungCap nhaCungCap, LoaiSanPham loatSanPham) {
        ArrayList<SanPham> result = new ArrayList<>();

        return result;
    }
    
    public SanPham getSanPham(int id){
        SanPham sp = new SanPham();
        
        return sp;
    }
    
    public boolean ThemSanPham(SanPham sp) {
        return true;
    }
    
    public boolean SưaSanPham(SanPham sp) {
        return true;
    }
    
    public boolean XoaSanPham(int id) {
        return true;
    }
}
