/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

/**
 *
 * @author Nhan
 */
public class Kho {
    private String maNL;
    private String tenNL;
    private float gia;
    private String dvt;
    private int slNhap;
    private Date ngayNhap;
    private Date ngayXuat;
    private String maNV;
    private int slXuat;

    public Kho() {
    }

    public Kho(String maNL, String tenNL, float gia, String dvt, int slNhap, Date ngayNhap, Date ngayXuat, String maNV, int slXuat) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.gia = gia;
        this.dvt = dvt;
        this.slNhap = slNhap;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
        this.maNV = maNV;
        this.slXuat = slXuat;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }
    
    
}
