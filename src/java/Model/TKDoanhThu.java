/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

public class TKDoanhThu extends DonHang{
    private float doanhThu;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    
    public TKDoanhThu() {
    }

    public TKDoanhThu(float doanhThu, Date ngayBatDau, Date ngayKetThuc, int ID, Date ngayTao, NhanVien nhanVien, ArrayList<HangXuat> hangXuat, int trangThai) {
        super(ID, ngayTao, nhanVien, hangXuat, trangThai);
        this.doanhThu = doanhThu;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
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
    
    public void setID(int ID) {
        super.setID(ID);
    }  
}
