/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class ThanhVien implements Serializable {
    private String ID;
    private String username;
    private String password;
    private String hoTen;
    private String email;
    private String dienThoai;
    private String moTa;
    private ArrayList<DiaChi> diaChi;

    public ThanhVien() {
    }

    public ThanhVien(String ID, String username, String password, String hoTen, String email, String dienThoai, String moTa, ArrayList<DiaChi> diaChi) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.email = email;
        this.dienThoai = dienThoai;
        this.moTa = moTa;
        this.diaChi = diaChi;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ArrayList<DiaChi> getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(ArrayList<DiaChi> diaChi) {
        this.diaChi = diaChi;
    }
}
