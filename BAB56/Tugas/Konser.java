/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB56.Tugas;

/**
 *
 * @author Auliya Putra
 */
public class Konser extends Reservasi {

    public Konser() {}

    public Konser(String namaEvent, String namaPemesan) {
        super(namaEvent, namaPemesan);
    }

    @Override
    public String kategoriEvent() {
        return "Konser Musik";
    }
}

