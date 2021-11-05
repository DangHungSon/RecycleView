package com.example.recycleview;

public class ThanhVien {
    private String tenNhom;
    private String slfan;
    private String status;
    private String baiviet;

    public ThanhVien(String tenNhom, String slfan, String status, String baiviet) {
        this.tenNhom = tenNhom;
        this.slfan = slfan;
        this.status = status;
        this.baiviet = baiviet;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public String getSlfan() {
        return slfan;
    }

    public void setSlfan(String slfan) {
        this.slfan = slfan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBaiviet() {
        return baiviet;
    }

    public void setBaiviet(String baiviet) {
        this.baiviet = baiviet;
    }
}


