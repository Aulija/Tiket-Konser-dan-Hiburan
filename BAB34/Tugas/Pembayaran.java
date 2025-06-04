/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB34.Tugas;

/**
 *
 * @author Auliya Putra
 */
public class Pembayaran extends EventKonser {
    private double diskon;
    private String metode;

    public Pembayaran(String nama, String artis, String lokasi, String waktu, int harga, String metode, double diskon) {
        super(nama, artis, lokasi, waktu, harga);
        this.metode = metode;
        this.diskon = diskon;
    }

    public double getDiskon() {
        return diskon;
    }

    public String getMetode() {
        return metode;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public int hitungBayar(int jumlah, int pajakPersen) {
        int awal = hitungTotal(jumlah, pajakPersen);
        return (int) (awal - (diskon / 100) * awal);
    }
}

