/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

public class LoaiSanPham implements Serializable{
    private int id;
    private String moTa;
    private String ten;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int id, String moTa, String ten) {
        this.id = id;
        this.moTa = moTa;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
