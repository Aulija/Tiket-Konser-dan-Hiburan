/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB34.Tugas;

/**
 *
 * @author Auliya Putra
 */
public class Reservasi extends EventKonser {
    private int jumlah;

    public Reservasi(String nama, String artis, String lokasi, String waktu, int harga, int jumlah) {
        super(nama, artis, lokasi, waktu, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

