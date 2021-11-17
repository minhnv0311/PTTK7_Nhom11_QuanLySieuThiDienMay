/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class TKNhaCungCap extends NhaCungCap{
    private int soLuong;

    public TKNhaCungCap() {
    }

    public TKNhaCungCap(int soLuong, int ID, String ten, String mota, ArrayList<SanPham> listSanPham) {
        super(ID, ten, mota, listSanPham);
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void setID(int ID) {
        super.setID(ID);
    }
    
    public void setTen(String ten) {
        super.setTen(ten);
    }
}
