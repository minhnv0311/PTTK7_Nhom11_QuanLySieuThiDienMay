/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

public class TKSanPham extends SanPham{
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int lanGiaoDich;
    private float doanhThu;

    public TKSanPham() {
    }

    public TKSanPham(Date ngayBatDau, Date ngayKetThuc, int lanGiaoDich, float doanhThu, int ID, String ten, float giaNhap, float giaBan, String loaiSanPham, String NhaCungCap, String manHinh, String pin, float dai, float rong, float cao, String doPhanGiai, int cameraTruoc, int cameraSau, String heDieuHanh, String cpu, String ram, String rom, String gpu, String sim, String wifi, String bluetooth, String gps, String tinhNangKhac, float khoiLuong) {
        super(ID, ten, giaNhap, giaBan, loaiSanPham, NhaCungCap, manHinh, pin, dai, rong, cao, doPhanGiai, cameraTruoc, cameraSau, heDieuHanh, cpu, ram, rom, gpu, sim, wifi, bluetooth, gps, tinhNangKhac, khoiLuong);
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.lanGiaoDich = lanGiaoDich;
        this.doanhThu = doanhThu;
    }


    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getLanGiaoDich() {
        return lanGiaoDich;
    }

    public void setLanGiaoDich(int lanGiaoDich) {
        this.lanGiaoDich = lanGiaoDich;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void setID(int ID) {
        super.setID(ID);
    }
    
    public void setTen(String ten) {
        super.setTen(ten);
    }
}
