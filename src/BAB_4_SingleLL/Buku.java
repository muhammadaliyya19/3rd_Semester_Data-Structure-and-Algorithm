/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_4_SingleLL;

/**
 *
 * @author Muhammad Aliyya Ilmi
 */
public class Buku {
    String kategori;
    String judul;
    double hargaSewa;
    double hargaDenda;

    public Buku(String kategori, String judul, Double hargaSewa, double hargaDenda) {
        this.kategori = kategori;
        this.judul = judul;
        this.hargaSewa = hargaSewa;
        this.hargaDenda = hargaDenda;
    }

    public String getKategori() {
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public Double getHargaSewa() {
        return hargaSewa;
    }

    public double getHargaDenda() {
        return hargaDenda;
    }
}
