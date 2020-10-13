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
import java.util.Scanner;
class NodeDLL {

    Object data;
    NodeDLL prev, next;
}

public class DoubleLinkedList {

    private NodeDLL pKepala, pEkor;
    private Buku Kepala, Ekor;
    int i = 1;

    public DoubleLinkedList() {
        pKepala = null;
        pEkor = null;
        Kepala = null;
        Ekor = null;
    }

    public void sisipDipKepala(int dt) {
        NodeDLL baru = new NodeDLL();
        baru.data = dt;
        if (pKepala == null) {
            baru.prev = pKepala;
            baru.next = pEkor;
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.next = pKepala;
            pKepala.prev = baru;
            pKepala = baru;
        }
    }
    public void sisipDiKepala(String kategori,String judul,
            Double hargaSewa,Double hargaDenda) {
        Buku baru = new Buku(kategori, judul,hargaSewa,hargaDenda);
        if (Kepala == null) {
            baru.Prev = Kepala;
            baru.Next = Ekor;
            Kepala = baru;
            Ekor = baru;
        } else {
            baru.Next = Kepala;
            Kepala.Prev = baru;
            Kepala = baru;
        }
    }

    public void sisipDipEkor(int data) {
        NodeDLL baru = new NodeDLL();
        baru.data = data;
        if (pEkor == null) {
            baru.prev = pKepala;
            baru.next = pEkor;
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.prev = pEkor;
            pEkor.next = baru;
            pEkor = baru;
        }
    }
    public void sisipDiEkor(String kategori,String judul,
            Double hargaSewa,Double hargaDenda) {
        Buku baru = new Buku(kategori, judul,hargaSewa,hargaDenda);
        if (Ekor == null) {
            baru.Prev = Kepala;
            baru.Next = Ekor;
            Kepala = baru;
            Ekor = baru;
        } else {
            baru.Prev = Ekor;
            Ekor.Next = baru;
            Ekor = baru;
        }
    }

    public void cetak(String kom) {
        System.out.println(kom);
        NodeDLL p = pKepala;
        while (p != pEkor.next) {
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.print("Null");
        System.out.println();
    }

   
    public void cetak2(String kom) {
        Buku p = Kepala;
        System.out.println("\n Data Buku :");
        while (p != Ekor.Next) {
            System.out.println(kom+""+i);
            System.out.println("Kategori       : "+p.getKategori());
            System.out.println("Judul          : "+p.getJudul());
            System.out.println("Harga Sewa     : "+p.getHargaSewa());
            System.out.println("Harga Denda    : "+p.getHargaDenda());
            p = p.Next;
            i++;
        }
        System.out.println();
        i = 1;
    }

    public void hapusDataTertentu(int dataHapus) {
        NodeDLL Scheck = pKepala;
        while(Scheck != pEkor){
            if((Integer)Scheck.data ==(Integer) dataHapus){
                Scheck.prev.next = Scheck.next;
                Scheck.next.prev = Scheck.prev;
            }
            Scheck = Scheck.next;
        }  
    }     
        public void hapusData(String judul) {
        Buku kepala = Kepala;
        while(kepala != Ekor){
                if(kepala.getJudul() == judul){
                    kepala.Prev.Next = kepala.Next;
                    kepala.Next.Prev = kepala.Prev;
                }
            kepala = kepala.Next;
        }
    }

    public void sisipDataTerurut(int data) {
        NodeDLL pointer = new NodeDLL();
        NodeDLL pointer2 = new NodeDLL();
        pointer.data = data;
        pointer2 = pKepala;
        if(pKepala == null){
            pKepala = pointer;
            pEkor = pointer;
        }
        else{
            if((Integer)pointer.data > (Integer)pEkor.data){
                pEkor.next = pointer;
                pointer.prev = pEkor;
                pEkor = pointer;
            }
            if((Integer)pointer.data <(Integer) pEkor.data){
                if(pEkor.prev == null){
                    pKepala = pointer;
                    pKepala.next = pEkor;
                    pEkor.prev = pKepala;
                }
                else{
                    pEkor.prev.next = pointer;
                    pointer.next = pEkor;
                    pointer.prev = pEkor.prev;
                    pEkor.prev = pointer;
                    if((Integer)pointer.data < (Integer)pointer.prev.data){
                        while(pointer2.next != null){
                            if((Integer)pointer.data < (Integer)pointer2.data){
                                if(pointer2.data == pKepala.data){
                                    pEkor.prev = pointer.prev;
                                    pointer.prev.next = pEkor;
                                    pointer.next = pKepala;
                                    pKepala.prev = pointer;
                                    pKepala = pointer;
                                    break;
                                }
                                else{
                                    pEkor.prev = pointer.prev;
                                    pointer.prev.next = pEkor;
                                    pointer2.prev.next = pointer;
                                    pointer.next = pointer2;
                                    pointer.prev = pointer2.prev;
                                    pointer2.prev = pointer;
                                    break;
                                }
                            }
                            pointer2 = pointer2.next;
                        }
                    }
                }      
            }
        }
    }

    public static void main(String s[]) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.sisipDipKepala(10);
        dll.sisipDipKepala(20);
        dll.sisipDipKepala(30);
        dll.cetak("Isi DLL setelah sisip data di pKepala");
        dll.sisipDipEkor(55);
        dll.sisipDipEkor(56);
        dll.sisipDipEkor(57);
        dll.cetak("Isi DLL setelah sisip data di pEkor");
        dll.hapusDataTertentu(55);
        dll.cetak("Isi DLL setelah data 55 dihapus");
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.sisipDataTerurut(30);
        dll2.sisipDataTerurut(10);
        dll2.sisipDataTerurut(25);
        dll2.sisipDataTerurut(100);
        dll2.sisipDataTerurut(20);
        System.out.println("\n");
        DoubleLinkedList dll3 = new DoubleLinkedList();
        dll2.sisipDataTerurut(5);
        dll2.sisipDataTerurut(50);
        dll2.cetak("Isi dll2 sisip data terurut");
//        dll3.sisipDiKepala("Novel", "Twilight",(double)15000,(double)5000);
//        dll3.sisipDiKepala("Komik", "Non-Non Byori",(double)20000,(double)8000);
//        dll3.sisipDiEkor("Novel", "Saga",(double) 17000,(double)6000);
//        dll3.sisipDiEkor("Komik", "Non-Non Byori Repeat",(double)22000,(double)9000);
//        dll3.hapusData("Saga");
//        dll3.cetak2("Buku ");
//        dll3.cetak2("Buku ");
        int b;
        do{
        System.out.println("Menu : ");
        System.out.println("1. Sisip Data Di Kepala");
        System.out.println("2. Sisip Data Di Ekor");
        System.out.println("3. Cetak");
        System.out.println("0. Exit");
        System.out.print("Pilihan :");
        b = input.nextInt();input.nextLine();
        switch(b){
            case 1 :
                System.out.print("Masukkan Jumlah Buku : ");
                int n = input.nextInt();input.nextLine();
                for(int a = 0;a<n;a++){
                    System.out.println("Buku "+(a+1));
                    System.out.print("Kategori       : ");
                    String kate = input.nextLine();
                    System.out.print("Judul          : ");
                    String judu = input.nextLine();
                    System.out.print("Harga Sewa     : ");
                    Double sewa = input.nextDouble();
                    System.out.print("Harga Denda    : ");
                    Double dend = input.nextDouble();input.nextLine();
                    dll3.sisipDiKepala(kate, judu, sewa, dend);
                }
                break;
            case 2 :
                System.out.print("Masukkan Jumlah Buku : ");
                int nn = input.nextInt();input.nextLine();
                for(int a = 0;a<nn;a++){
                    System.out.println("Buku "+(a+1));
                    System.out.print("Kategori       : ");
                    String kate = input.nextLine();
                    System.out.print("Judul          : ");
                    String judu = input.nextLine();
                    System.out.print("Harga Sewa     : ");
                    Double sewa = input.nextDouble();
                    System.out.print("Harga Denda    : ");
                    Double dend = input.nextDouble();input.nextLine();
                    dll3.sisipDiEkor(kate, judu, sewa, dend);
                }
                break;
            case 3 :
                dll3.cetak2("Buku ");
        }
        }while(b!=0);
    }
}
