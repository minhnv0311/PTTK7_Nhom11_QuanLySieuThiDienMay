/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class NhanVien extends ThanhVien{
    private int IDNhanvien;
    private String viTri;

    public NhanVien() {
    }

    public NhanVien(int IDNhanvien, String viTri, String ID, String username, String password, String hoTen, String email, String dienThoai, String moTa, ArrayList<DiaChi> diaChi) {
        super(ID, username, password, hoTen, email, dienThoai, moTa, diaChi);
        this.IDNhanvien = IDNhanvien;
        this.viTri = viTri;
    }

    public int getIDNhanvien() {
        return IDNhanvien;
    }

    public void setIDNhanvien(int IDNhanvien) {
        this.IDNhanvien = IDNhanvien;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
}
