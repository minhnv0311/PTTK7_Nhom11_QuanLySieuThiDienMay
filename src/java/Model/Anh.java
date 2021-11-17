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
public class Anh {
    private int id;
    private int idSanPham;
    private int idDanhGia;
    private String Type;
    private String FilePath;
    public Anh(int idSanPham, int idDanhGia, String Type, String FilePath){
        this.idSanPham = idSanPham;
        this.idDanhGia = idDanhGia;
        this.Type = Type;
        this.FilePath = FilePath;
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

    public int getIdDanhGia() {
        return idDanhGia;
    }

    public void setIdDanhGia(int idDanhGia) {
        this.idDanhGia = idDanhGia;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }
    
}
