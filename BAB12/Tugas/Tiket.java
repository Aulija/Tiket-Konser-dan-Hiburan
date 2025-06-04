/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB12.Tugas;

/**
 *
 * @author Auliya Putra
 */
    public class Tiket {
    private String namaEvent;
    private String tanggal;
    private String lokasi;
    private double harga;
    private boolean tersedia;

    // Constructor untuk menginisialisasi atribut saat objek dibuat
    public Tiket(String namaEvent, String tanggal, String lokasi, double harga, boolean tersedia) {
        this.namaEvent = namaEvent;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.harga = harga;
        this.tersedia = tersedia;
    }

    // Method untuk menampilkan informasi tiket
    public void tampilkanInfo() {
        System.out.println("===== Informasi Tiket =====");
        System.out.println("Event   : " + namaEvent);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Lokasi  : " + lokasi);
        System.out.println("Harga   : Rp " + harga);
        System.out.println("Status  : " + (tersedia ? "Tersedia" : "Habis"));
        System.out.println("============================");
    }

    // Method untuk melakukan reservasi tiket
    public void reservasi() {
        if (tersedia) {
            tersedia = false;
            System.out.println("\nReservasi berhasil! Tiket untuk " + namaEvent + " telah dipesan.");
        } else {
            System.out.println("\nMaaf, tiket untuk " + namaEvent + " sudah habis.");
        }
    }

    // Method untuk mengubah status tiket
    public void ubahStatus(boolean statusBaru) {
        tersedia = statusBaru;
        System.out.println("\nStatus tiket telah diperbarui menjadi: " + (tersedia ? "Tersedia" : "Habis"));
    }
}
