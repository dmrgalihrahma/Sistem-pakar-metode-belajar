package com.example.damar.finalproject.model;

public class Klasifikasi {
    private int _id;
    private String kode_id;
    private String klasifikasi;
    private String kategori_id;
    private Integer group_index;

    public Klasifikasi(int _id, String kode_id, String klasifikasi, String kategori_id, Integer group_index) {
        this._id = _id;
        this.kode_id = kode_id;
        this.klasifikasi = klasifikasi;
        this.kategori_id = kategori_id;
        this.group_index = group_index;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getKode_id() {
        return kode_id;
    }

    public void setKode_id(String kode_id) {
        this.kode_id = kode_id;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public String getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(String kategori_id) {
        this.kategori_id = kategori_id;
    }

    public Integer getGroup_index() { return group_index; }

    public void setGroup_index(Integer group_index) { this.group_index = group_index; }
}
