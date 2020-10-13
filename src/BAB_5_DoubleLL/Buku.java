/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_5_DoubleLL;

/**
 *
 * @author Muhammad Aliyya Ilmi
 */
public class Buku {
    String kategori;
    String judul;
    private Double hargaSewa;
    private Double hargaDenda;
    Buku Next;
    Buku Prev;
    
    Buku(String kategori,String judul,Double hargaSewa,Double hargaDenda){
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
    public Double getHargaDenda() {
        return hargaDenda;
    }
    
}
