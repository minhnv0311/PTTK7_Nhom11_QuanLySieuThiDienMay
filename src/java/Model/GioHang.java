/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Minh Nguyen
 */
public class GioHang {
    private int id;
    private int idSanPham;
    private int SoLuong;
    private int idKhachHang;
    public GioHang() {
    }

    public GioHang(int idSanPham, int SoLuong, int idKhachHang) {
        this.idSanPham = idSanPham;
        this.SoLuong = SoLuong;
        this.idKhachHang = idKhachHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
    
}
