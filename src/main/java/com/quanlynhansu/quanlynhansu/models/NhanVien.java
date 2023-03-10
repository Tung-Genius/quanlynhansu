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

    public NhanVien(NhanvienBuilder nhanvienBuilder){
        this.manv = nhanvienBuilder.manv;
        this.hoten = nhanvienBuilder.hoten;
        this.ngaysinh = nhanvienBuilder.ngaysinh;
        this.quequan = nhanvienBuilder.quequan;
        this.dantoc = nhanvienBuilder.dantoc;
        this.tongiao = nhanvienBuilder.tongiao;
        this.tinhtranghonnhan = nhanvienBuilder.tinhtranghonnhan;
        this.tinhtrangsuckhoe = nhanvienBuilder.tinhtrangsuckhoe;
        this.image = nhanvienBuilder.image;
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

    public static class NhanvienBuilder{
        private String manv;
        private final String hoten;
        private String ngaysinh;
        private String quequan;
        private String dantoc;
        private String tongiao;
        private String tinhtranghonnhan;
        private String tinhtrangsuckhoe;
        private String image;
        public NhanvienBuilder manv(String manv){
            this.manv = manv;
            return this;
        }
        public NhanvienBuilder(String hoten){
            this.hoten = hoten;
        }

        public NhanvienBuilder ngaysinh(String ngaysinh){
            this.ngaysinh = ngaysinh;
            return this;
        }

        public NhanvienBuilder quequan(String quequan){
            this.quequan = quequan;
            return this;
        }

        public NhanvienBuilder dantoc(String dantoc){
            this.dantoc = dantoc;
            return this;
        }

        public NhanvienBuilder tongiao(String tongiao){
            this.tongiao = tongiao;
            return this;
        }

        public NhanvienBuilder tinhtranghonnhan(String tinhtranghonnhan){
            this.tinhtranghonnhan = tinhtranghonnhan;
            return this;
        }

        public NhanvienBuilder tinhtrangsuckhoe(String tinhtrangsuckhoe){
            this.ngaysinh = ngaysinh;
            return this;
        }

        public NhanvienBuilder image(String image){
            this.image = image;
            return this;
        }

        public NhanVien build(){
            return new NhanVien(this);
        }
    }
}
