/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.TUGAS;

/**
 *
 * @author Auliya Putra
 */
public abstract class TiketEvent {
    protected String namaEvent, lokasi, waktu;
    protected int harga;

    public TiketEvent(String namaEvent, String lokasi, String waktu, int harga) {
        this.namaEvent = namaEvent;
        this.lokasi = lokasi;
        this.waktu = waktu;
        this.harga = harga;
    }

    public abstract int hitungTotal(int jumlahTiket);
    public abstract String toString();
}

