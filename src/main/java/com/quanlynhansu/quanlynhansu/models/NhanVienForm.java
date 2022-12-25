package com.quanlynhansu.quanlynhansu.models;

import org.springframework.web.multipart.MultipartFile;

public class NhanVienForm {
    private String manv;
    private String hoten;
    private String ngaysinh;
    private String quequan;
    private String dantoc;
    private String tongiao;
    private String tinhtranghonnhan;
    private String tinhtrangsuckhoe;
    private MultipartFile image;

    public NhanVienForm() {
    }
    public NhanVienForm(NhanVienFormBuilder nhanVienFormBuilder) {
        this.manv = nhanVienFormBuilder.manv;
        this.hoten = nhanVienFormBuilder.hoten;
        this.ngaysinh = nhanVienFormBuilder.ngaysinh;
        this.quequan = nhanVienFormBuilder.quequan;
        this.dantoc = nhanVienFormBuilder.dantoc;
        this.tongiao = nhanVienFormBuilder.tongiao;
        this.tinhtranghonnhan = nhanVienFormBuilder.tinhtranghonnhan;
        this.tinhtrangsuckhoe = nhanVienFormBuilder.tinhtrangsuckhoe;
        this.image = nhanVienFormBuilder.image;
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

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }


    public static class NhanVienFormBuilder{
        private String manv;
        private final String hoten;
        private String ngaysinh;
        private String quequan;
        private String dantoc;
        private String tongiao;
        private String tinhtranghonnhan;
        private String tinhtrangsuckhoe;
        private MultipartFile image;
        public NhanVienFormBuilder manv(String manv){
            this.ngaysinh = manv;
            return this;
        }
        public NhanVienFormBuilder(String hoten){
            this.hoten = hoten;
        }
        public NhanVienFormBuilder ngaysinh(String ngaysinh){
            this.ngaysinh = ngaysinh;
            return this;
        }
        public NhanVienFormBuilder quequan(String quequan){
            this.quequan = quequan;
            return this;
        }
        public NhanVienFormBuilder dantoc(String dantoc){
            this.dantoc = dantoc;
            return this;
        }
        public NhanVienFormBuilder tongiao(String tongiao){
            this.tongiao = tongiao;
            return this;
        }
        public NhanVienFormBuilder tinhtranghonnhan(String tinhtranghonnhan){
            this.tinhtranghonnhan = tinhtranghonnhan;
            return this;
        }
        public NhanVienFormBuilder tinhtrangsuckhoe(String tinhtrangsuckhoe){
            this.tinhtrangsuckhoe = tinhtrangsuckhoe;
            return this;
        }
        public NhanVienFormBuilder image(MultipartFile image){
            this.image = image;
            return this;
        }
        public NhanVienForm build(){
            return new NhanVienForm(this);
        }
    }
}
