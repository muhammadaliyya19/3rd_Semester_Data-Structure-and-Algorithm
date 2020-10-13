/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_6_CircularLL;

/**
 *
 * @author Muhammad Aliyya Ilmi
 */
class NodeCSLLB {
    Buku data;
    NodeCSLLB next , prev;
}

public class CircularDoubleLinkedListBuku {

    private NodeCSLLB pAwal, pAkhir;
    private int counter;

    public CircularDoubleLinkedListBuku() {
        pAwal = null;
        pAkhir = null;
        counter = -1;
    }

    public void SisipDataUrut(Buku data) {
        NodeCSLLB pBaru = new NodeCSLLB();
        NodeCSLLB Kondektur = pAwal;
        NodeCSLLB Temp;
        pBaru.data = data;
        if (pAwal == null) {
            pAwal = pBaru;
            pAkhir = pBaru;
            pBaru.next = pAwal;
            pBaru.prev = pAwal;
            counter = 0;
        } else {
            int i = 0;
            while(i <= counter && Kondektur.next != null){
                if(counter == 0){
                    if(Kondektur.data.hargaDenda < pBaru.data.hargaDenda){
                        pAwal = pBaru;
                        pAwal.prev = pAkhir;
                        pAwal.next = Kondektur;
                        Kondektur.prev = pBaru;
                        break; 
                    }else{
                        Temp = Kondektur.next;
                        Kondektur.next = pBaru;
                        pBaru.next = Temp;
                        break;
                    }
                }else{
                    if(Kondektur.data.hargaDenda < pBaru.data.hargaDenda && Kondektur == pAwal){
                        pAwal = pBaru;
                        pAwal.prev = pAkhir;
                        pAwal.next = Kondektur;
                        break; 
                    }else if(Kondektur.data.hargaDenda < pBaru.data.hargaDenda && Kondektur == pAkhir){
                        Kondektur.next = pBaru;
                        pBaru.prev = Kondektur;
                        pBaru.next = pAwal;
                        pAkhir = pBaru;
                        break; 
                    }else{
                        Temp = Kondektur.next;
                        Kondektur.next = pBaru;
                        pBaru.next = Temp;
                        break;
                    }
                }
            }
            Kondektur = Kondektur.next;
        }
        counter++;
    }
    
    public void cetakBuku() {
        NodeCSLLB pCetak;
        pCetak = pAwal;
        int i = 0;
        System.out.println("------------------------------------------------");
        System.out.println("                  PERPUSTAKAAN                  ");
        System.out.println("------------------------------------------------");
        System.out.println("Kategori\t Judul\t    H.Sewa\tH.Denda");
        while ((i < counter && pCetak != null)) {
            System.out.println(pCetak.data.kategori + "\t\t " + pCetak.data.judul + "\t    " 
                               + pCetak.data.hargaSewa + "\t" + pCetak.data.hargaDenda);
            pCetak = pCetak.next;
            i++;
        }
        System.out.println();
    }
    
    public void cetakBuku(String param, double hargaSewa){
        NodeCSLLB pCetak;
        pCetak = pAwal;
        int i = 0;
        System.out.println("------------------------------------------------");
        System.out.println("                  PERPUSTAKAAN                  ");
        System.out.println("------------------------------------------------");
        System.out.println("Data buku dengan harga sewa " + param + " " + hargaSewa);
        System.out.println("Kategori\t Judul\t    H.Sewa\tH.Denda");
        while ((i < counter && pCetak != null)) {
            if(param.equals("lebih dari")){
                if(pCetak.data.hargaSewa > hargaSewa){
                System.out.println(pCetak.data.kategori + "\t\t " + pCetak.data.judul + "\t    " 
                               + pCetak.data.hargaSewa + "\t" + pCetak.data.hargaDenda);
                }
            }
            i++;
            pCetak = pCetak.next;
        }
    }
    
    public static void main(String[] args) {
        CircularDoubleLinkedListBuku csll = new CircularDoubleLinkedListBuku();
        csll.SisipDataUrut(new Buku("Novel", "Ayah", 6000.0 , 600));
        csll.SisipDataUrut(new Buku("Manga", "Boruto", 2000.0 , 200));
        csll.SisipDataUrut(new Buku("Manga", "Boruto", 2000.0 , 200));
        csll.SisipDataUrut(new Buku("Majalah", "Gaul", 3000.0 , 300));
        csll.SisipDataUrut(new Buku("Majalah", "Bobo",  3000.0 , 300));
        csll.SisipDataUrut(new Buku("Novel", "Pulang",5500.0 , 550));
        csll.cetakBuku();
        csll.cetakBuku("lebih dari" , 3000);
    }
}
