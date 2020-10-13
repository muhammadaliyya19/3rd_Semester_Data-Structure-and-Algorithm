/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class RealisasiDLL {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        DoubleLL LL = new DoubleLL(); //instansiasi objek LL
        int pilihan;
        do {
            System.out.println(">>>Program DOuble Linked List<<<");
            System.out.println();
            System.out.println("Pilihan Menu : ");
            System.out.println("0. Keluar");
            System.out.println("1. Merangkai Double Linked List dari Kepala");
            System.out.println("2. Menampilkan Double Linked List dari Kepala");
            System.out.println("3. Menampilkan Double Linked List dari Ekor");
            System.out.println("4. Menambahkan data setelah Ekor");
            System.out.println("5. Menambahkan data sebelum Head");
            System.out.println("6. Menyisipkan data dengan keyword NIM");
            System.out.println();
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            in.nextLine();
            switch (pilihan) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println();
                    DLLNode gerbongH = new DLLNode();
                    System.out.print("NIM gerbong\t= ");
                    gerbongH.NIM = in.nextInt();in.nextLine();
                    System.out.print("Nama Gerbong\t= ");
                    gerbongH.nama = in.nextLine();
                    LL.addNodefromHead(gerbongH);
                    System.out.println();
                    break;
                case 2 : 
                    System.out.println("Hasil Linked List dari Kepala");
                    LL.printNodefromHead();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hasil Linked List dari Ekor");
                    LL.printNodefromTail();
                    System.out.println();
                    break;
                case 4 :
                    
                    break;
                case 5 :
                    
                    break;
                case 6 :
                    
                    break;
                default:
                    System.out.println("Masukkan Pilihan Anda dengan Benar");
            }
        } while (pilihan != 0);

    }
}
