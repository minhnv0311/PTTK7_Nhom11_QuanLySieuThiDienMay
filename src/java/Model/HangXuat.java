/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;

public class HangXuat implements Serializable{
    private int ID;
    private Date ngayXuat;
    private int soluong;
    private int idSanPham;

    public HangXuat() {
    }

    public HangXuat(int ID, Date ngayXuat, int soluong, int idSanPham) {
        this.ID = ID;
        this.ngayXuat = ngayXuat;
        this.soluong = soluong;
        this.idSanPham = idSanPham;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setSanPham(int sanPham) {
        this.idSanPham = sanPham;
    }
}
