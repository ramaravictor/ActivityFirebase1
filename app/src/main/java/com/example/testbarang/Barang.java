package com.example.testbarang;

import java.io.Serializable;

public class Barang implements Serializable {
    private String kode;
    private String nama;
    private String mainKey;

    public Barang() {

    }

    public String getKode() {
        return kode;
    }

    public String getMainKey() {
        return  mainKey;
    }

    public void setMainKey(String kd) {
        this.mainKey = kd;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return " " + kode + "\n" +
                " " + nama;
    }

    public Barang(String kd, String nm) {
        kode = kd;
        nama = nm;
    }
}