/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Minh Nguyen
 */
public class HangNhap {
        private int ID;
    private Date ngayNhap;
    private int soluong;
    private int idSanPham;
    private int idNhanVienKho;

    public HangNhap() {
    }

    public HangNhap(int ID, Date ngayNhap, int soluong, int idSanPham, int idNhanVienKho) {
        this.ID = ID;
        this.ngayNhap = ngayNhap;
        this.soluong = soluong;
        this.idSanPham = idSanPham;
        this.idNhanVienKho = idNhanVienKho;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
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

    public int getIdNhanVienKho() {
        return idNhanVienKho;
    }

    public void setIdNhanVienKho(int idNhanVienKho) {
        this.idNhanVienKho = idNhanVienKho;
    }
    
}
