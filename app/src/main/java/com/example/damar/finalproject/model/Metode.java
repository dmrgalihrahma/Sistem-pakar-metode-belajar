package com.example.damar.finalproject.model;

public class Metode {
    private int _id;
    private int kategori_id;
    private int ciri_id;
    private int ciri2_id;
    private String kode_id;
    private String nama;
    private String keterangan;

    public Metode(int _id, int kategori_id, int ciri_id, int ciri2_id, String kode_id, String nama, String keterangan) {
        this._id = _id;
        this.kategori_id = kategori_id;
        this.ciri_id = ciri_id;
        this.ciri2_id = ciri2_id;
        this.kode_id = kode_id;
        this.nama = nama;
        this.keterangan = keterangan;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public int getCiri_id() {
        return ciri_id;
    }

    public void setCiri_id(int ciri_id) {
        this.ciri_id = ciri_id;
    }

    public int getCiri2_id() {
        return ciri2_id;
    }

    public void setCiri2_id(int ciri2_id) {
        this.ciri2_id = ciri2_id;
    }

    public String getKode_id() {
        return kode_id;
    }

    public void setKode_id(String kode_id) {
        this.kode_id = kode_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
