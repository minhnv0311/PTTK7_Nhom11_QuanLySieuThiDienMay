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
public class DanhGiaSanPham {
    private int id;
    private int idSanPham;
    private int NoiDung;
    private int Diem;
    private int idKhachHang;
    
    public DanhGiaSanPham(int idSanPham, int NoiDung, int Diem, int idKhachHang){
        this.idSanPham = idSanPham;
        this.NoiDung = NoiDung;
        this.Diem = Diem;
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

    public int getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(int NoiDung) {
        this.NoiDung = NoiDung;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int Diem) {
        this.Diem = Diem;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
    
}
