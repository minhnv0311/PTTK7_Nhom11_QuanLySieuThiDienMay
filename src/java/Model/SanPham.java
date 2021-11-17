/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

public class SanPham implements Serializable{
    private int ID;
    private String ten;
    private float giaNhap;
    private float giaBan;
    private String loaiSanPham;
    private String NhaCungCap;
    private String manHinh;
    private String pin;
    private float dai;
    private float rong;
    private float cao;
    private String doPhanGiai;
    private int cameraTruoc;
    private int cameraSau;
    private String heDieuHanh;
    private String cpu;
    private String ram;
    private String rom;
    private String gpu;
    private String sim;
    private String wifi;
    private String bluetooth;
    private String gps;
    private String tinhNangKhac;
    private float khoiLuong;

    public SanPham() {
    }

    public SanPham(int ID, String ten, float giaNhap, float giaBan, String loaiSanPham, String NhaCungCap, String manHinh, String pin, float dai, float rong, float cao, String doPhanGiai, int cameraTruoc, int cameraSau, String heDieuHanh, String cpu, String ram, String rom, String gpu, String sim, String wifi, String bluetooth, String gps, String tinhNangKhac, float khoiLuong) {
        this.ID = ID;
        this.ten = ten;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.loaiSanPham = loaiSanPham;
        this.NhaCungCap = NhaCungCap;
        this.manHinh = manHinh;
        this.pin = pin;
        this.dai = dai;
        this.rong = rong;
        this.cao = cao;
        this.doPhanGiai = doPhanGiai;
        this.cameraTruoc = cameraTruoc;
        this.cameraSau = cameraSau;
        this.heDieuHanh = heDieuHanh;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.gpu = gpu;
        this.sim = sim;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.gps = gps;
        this.tinhNangKhac = tinhNangKhac;
        this.khoiLuong = khoiLuong;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public float getCao() {
        return cao;
    }

    public void setCao(float cao) {
        this.cao = cao;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

    public int getCameraTruoc() {
        return cameraTruoc;
    }

    public void setCameraTruoc(int cameraTruoc) {
        this.cameraTruoc = cameraTruoc;
    }

    public int getCameraSau() {
        return cameraSau;
    }

    public void setCameraSau(int cameraSau) {
        this.cameraSau = cameraSau;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getTinhNangKhac() {
        return tinhNangKhac;
    }

    public void setTinhNangKhac(String tinhNangKhac) {
        this.tinhNangKhac = tinhNangKhac;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
}
