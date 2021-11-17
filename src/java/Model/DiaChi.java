/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

public class DiaChi implements Serializable{
    private int ID;
    private String diaChi;
    private String xaPhuong;
    private String quanHuyen;
    private String tinhThanh;

    public DiaChi() {
    }

    public DiaChi(int ID, String diaChi, String xaPhuong, String quanHuyen, String tinhThanh) {
        this.ID = ID;
        this.diaChi = diaChi;
        this.xaPhuong = xaPhuong;
        this.quanHuyen = quanHuyen;
        this.tinhThanh = tinhThanh;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }
}

