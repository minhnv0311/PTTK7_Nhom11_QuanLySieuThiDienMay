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
public class KhachHang {
    private int id;
    private int OTP;
    
    public KhachHang(int OTP) {
        this.OTP = OTP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOTP() {
        return OTP;
    }

    public void setOTP(int OTP) {
        this.OTP = OTP;
    }
    
}
