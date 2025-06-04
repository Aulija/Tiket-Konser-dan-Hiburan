/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8910.Tugas;

/**
 *
 * @author Auliya Putra
 */
public abstract class TiketEvent implements ITiket {
    protected String namaEvent, lokasi, waktu;
    protected int harga;

    public TiketEvent(String namaEvent, String lokasi, String waktu, int harga) {
        this.namaEvent = namaEvent;
        this.lokasi = lokasi;
        this.waktu = waktu;
        this.harga = harga;
    }

    @Override
    public abstract int hitungTotal(int jumlahTiket);

    @Override
    public abstract String toString();
}

