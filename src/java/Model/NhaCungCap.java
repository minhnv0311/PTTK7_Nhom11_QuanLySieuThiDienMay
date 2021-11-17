/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class NhaCungCap implements Serializable{
    private int ID;
    private String ten;
    private String mota;
    private ArrayList<SanPham> listSanPham;

    public NhaCungCap() {
    }

    public NhaCungCap(int ID, String ten, String mota, ArrayList<SanPham> listSanPham) {
        this.ID = ID;
        this.ten = ten;
        this.mota = mota;
        this.listSanPham = listSanPham;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public ArrayList<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(ArrayList<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }
}
