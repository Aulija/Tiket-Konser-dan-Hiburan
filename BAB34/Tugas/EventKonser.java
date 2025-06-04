/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB34.Tugas;

/**
 *
 * @author Auliya Putra
 */
public class EventKonser {
    private String namaEvent;
    private String artis;
    private String lokasi;
    private String waktu;
    private int harga;

    public EventKonser(String namaEvent, String artis, String lokasi, String waktu, int harga) {
        this.namaEvent = namaEvent;
        this.artis = artis;
        this.lokasi = lokasi;
        this.waktu = waktu;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaEvent() {
        return namaEvent;
    }

    public String getArtis() {
        return artis;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getWaktu() {
        return waktu;
    }

    public int getHarga() {
        return harga;
    }

    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int hitungTotal(int jumlah, int pajakPersen) {
        int total = harga * jumlah;
        int pajak = (total * pajakPersen) / 100;
        return total + pajak;
    }
}

