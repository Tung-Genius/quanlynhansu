package com.quanlynhansu.quanlynhansu.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    private String manv;
    private String hoten;
    private String ngaysinh;
    private String quequan;
    private String dantoc;
    private String tongiao;
    private String tinhtranghonnhan;
    private String tinhtrangsuckhoe;
    private String image;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, String ngaysinh, String quequan, String dantoc, String tongiao, String tinhtranghonnhan, String tinhtrangsuckhoe, String image) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.dantoc = dantoc;
        this.tongiao = tongiao;
        this.tinhtranghonnhan = tinhtranghonnhan;
        this.tinhtrangsuckhoe = tinhtrangsuckhoe;
        this.image = image;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    public String getTongiao() {
        return tongiao;
    }

    public void setTongiao(String tongiao) {
        this.tongiao = tongiao;
    }

    public String getTinhtranghonnhan() {
        return tinhtranghonnhan;
    }

    public void setTinhtranghonnhan(String tinhtranghonnhan) {
        this.tinhtranghonnhan = tinhtranghonnhan;
    }

    public String getTinhtrangsuckhoe() {
        return tinhtrangsuckhoe;
    }

    public void setTinhtrangsuckhoe(String tinhtrangsuckhoe) {
        this.tinhtrangsuckhoe = tinhtrangsuckhoe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
