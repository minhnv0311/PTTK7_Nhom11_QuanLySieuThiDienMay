/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class DonHang implements Serializable{
    private int ID;
    private Date ngayTao;
    private NhanVien nhanVien;
    private ArrayList<HangXuat> hangXuat;
    private int trangThai;

    public DonHang() {
    }

    public DonHang(int ID, Date ngayTao, NhanVien nhanVien, ArrayList<HangXuat> hangXuat, int trangThai) {
        this.ID = ID;
        this.ngayTao = ngayTao;
        this.nhanVien = nhanVien;
        this.hangXuat = hangXuat;
        this.trangThai = trangThai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public ArrayList<HangXuat> getHangXuat() {
        return hangXuat;
    }

    public void setHangXuat(ArrayList<HangXuat> hangXuat) {
        this.hangXuat = hangXuat;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}

