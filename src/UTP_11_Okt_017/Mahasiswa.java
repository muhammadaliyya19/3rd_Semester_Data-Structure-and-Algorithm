/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTP_11_Okt_017;

/**
 *
 * @author Muhammad Aliyya Ilmi
 */
public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String Matkul;

    public Mahasiswa(String Nama, String NIM, String Matkul){
        this.Nama = Nama;
        this.NIM = NIM;
        this.Matkul = Matkul;
    }

    public String getNIM() {
        return NIM;
    }

    public void ShowData(){
        System.out.println("Nama   = " + Nama);
        System.out.println("NIM    = " + NIM);
        System.out.println("Matkul = " + Matkul);
        System.out.println("----- v v v --------- v v v -----");
    }
    
}
