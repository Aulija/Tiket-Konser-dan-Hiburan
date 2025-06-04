/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB56.Tugas;

/**
 *
 * @author Auliya Putra
 */
public abstract class Reservasi {
 protected String namaEvent;
 protected String namaPemesan;
 protected int jumlahTiket;
 public Reservasi() {}
 public Reservasi(String namaEvent, String namaPemesan) 
{
 this.namaEvent = namaEvent;
 this.namaPemesan = namaPemesan;
 }
 // Overloading
 public void setData(String namaEvent, String 
namaPemesan) {
 this.namaEvent = namaEvent;
 this.namaPemesan = namaPemesan;
 }
 public void setData(String namaEvent, String 
namaPemesan, int jumlahTiket) {
 this.namaEvent = namaEvent;
 this.namaPemesan = namaPemesan;
 this.jumlahTiket = jumlahTiket;
 }
 public String infoReservasi() {
 return namaEvent + " - " + namaPemesan + " (" + 
jumlahTiket + " tiket)";
 }
 // Method abstrak (harus diimplementasikan di subclass)
 public abstract String kategoriEvent();
}

