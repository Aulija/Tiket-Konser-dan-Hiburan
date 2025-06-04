/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.TUGAS;

/**
 *
 * @author Auliya Putra
 */
public class EventKonser extends TiketEvent {
    private String artis;
    private int jumlah;

    public EventKonser(String namaEvent, String lokasi, String waktu, int harga, String artis, int jumlah) {
        super(namaEvent, lokasi, waktu, harga);
        this.artis = artis;
        this.jumlah = jumlah;
    }

    @Override
    public int hitungTotal(int jumlahTiket) {
        return harga * jumlahTiket + (harga * jumlahTiket * 10 / 100); // pajak 10%
    }

    @Override
    public String toString() {
        return "=== Tiket Konser ===\n"
             + "Event: " + namaEvent + "\n"
             + "Artis: " + artis + "\n"
             + "Lokasi: " + lokasi + "\n"
             + "Waktu: " + waktu + "\n"
             + "Harga per Tiket: Rp " + harga + "\n"
             + "Jumlah Tiket: " + jumlah + "\n"
             + "Total Bayar: Rp " + hitungTotal(jumlah) + "\n";
    }
}
