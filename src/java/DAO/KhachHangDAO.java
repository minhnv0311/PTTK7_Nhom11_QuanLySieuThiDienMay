/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.KhachHang;

/**
 *
 * @author Minh Nguyen
 */
public class KhachHangDAO extends DAO {
    public KhachHangDAO(){}
    
    public boolean ThemKhachHang(KhachHang kh){
        return true;
    }
    
    public boolean SưaKhachHang(KhachHang kh){
        return true;
    }
    public String GenerateOTP(){
        return "xxx";
    }
}
