/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class dataBarang {
    String kodeBarang, namaBarang;
    float hargaBarang;
    int jumlahBeli;
    double bayar;

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public float getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(float hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
    public double getbayar(){
        bayar = hargaBarang * jumlahBeli;
        return bayar;
    }
}
