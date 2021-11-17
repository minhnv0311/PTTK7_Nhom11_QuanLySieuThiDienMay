/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.NhaCungCap;
import java.util.ArrayList;

public class NhaCungCapDAO extends DAO {

    public NhaCungCapDAO() {
    }

    public ArrayList<NhaCungCap> getDanhSachNCC() {
        ArrayList<NhaCungCap> result = new ArrayList<>();

        return result;
    }
    public NhaCungCap getNhaCungCap(int id){
        NhaCungCap ncc = new NhaCungCap();
        
        return ncc;
    }
    
    public void ThemNhaCungCap(NhaCungCap ncc) {
        
    }
    
    public void SưaNhaCungCap(NhaCungCap ncc) {
        
    }
    
    public boolean XoaNhaCungCap(int id) {
        return true;
    }
}

