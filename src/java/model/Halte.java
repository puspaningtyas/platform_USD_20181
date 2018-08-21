/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user only
 */
public class Halte {
    private int penumpangMasuk;
    private int penumpangKeluar;
    private String tanggal;
    private String nama;
    private String lokasi;

    public Halte() {
    }

    public String toString(){
        return nama +","+lokasi;
    }
    public Halte(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }
    
    
    /**
     * @return the penumpangMasuk
     */
    public int getPenumpangMasuk() {
        return penumpangMasuk;
    }

    /**
     * @param penumpangMasuk the penumpangMasuk to set
     */
    public void setPenumpangMasuk(int penumpangMasuk) {
        this.penumpangMasuk = penumpangMasuk;
    }

    /**
     * @return the penumpangKeluar
     */
    public int getPenumpangKeluar() {
        return penumpangKeluar;
    }

    /**
     * @param penumpangKeluar the penumpangKeluar to set
     */
    public void setPenumpangKeluar(int penumpangKeluar) {
        this.penumpangKeluar = penumpangKeluar;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the lokasi
     */
    public String getLokasi() {
        return lokasi;
    }

    /**
     * @param lokasi the lokasi to set
     */
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    
}
