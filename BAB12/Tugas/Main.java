/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB12.Tugas;

/**
 *
 * @author Auliya Putra
 */

public class Main {
    public static void main(String[] args) {
        // Membuat objek tiket dengan constructor
        Tiket tiket1 = new Tiket("Konser BLACKPINK", "20 November 2025", "Stadion Utama GBK", 2000000, true);
        
        // Menampilkan informasi tiket sebelum reservasi
        tiket1.tampilkanInfo();
        
        // Melakukan reservasi tiket
        tiket1.reservasi();
        
        // Menampilkan informasi setelah reservasi
        tiket1.tampilkanInfo();
        
        // Mengubah status tiket menjadi tersedia kembali
        tiket1.ubahStatus(true);
        
        // Menampilkan informasi setelah status diperbarui
        tiket1.tampilkanInfo();
    }
}

