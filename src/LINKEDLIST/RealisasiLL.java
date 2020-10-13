package LINKEDLIST;

import java.util.Scanner;

public class RealisasiLL {

    public static void main(String[] args) {
//
//        Node gerbongA = new Node();
//        Node gerbongB = new Node();
//        Node gerbongC = new Node();
//
//        gerbongA.NIM = 1;
//        gerbongA.nama = "A";
//
//        gerbongB.NIM = 2;
//        gerbongB.nama = "B";
//
//        gerbongC.NIM = 3;
//        gerbongC.nama = "C";
//
//        //Mengaitkan antar gerbong
//        gerbongA.next = gerbongB;
//        gerbongB.next = gerbongC;
//        gerbongC.next = null;
//
//        //Kondektur
//        Node kondektur;
//
//        kondektur = gerbongA;
//
//        System.out.println(kondektur.nama);
//
//        kondektur = kondektur.next;
//        System.out.println(kondektur.nama);
//
//        kondektur = kondektur.next;
//        System.out.println(kondektur.nama);
//    

        Scanner in = new Scanner(System.in);
        SingleLL LL = new SingleLL(); //instansiasi objek LL
        int pilihan;
        do {
            System.out.println(">>>Program Single Linked List<<<");
            System.out.println();
            System.out.println("Pilihan Menu : ");
            System.out.println("0. Keluar");
            System.out.println("1. Merangkai Linked List dari Kepala");
            System.out.println("2. Merangkai Linked List dari Ekor");
            System.out.println("3. Menampilkan Linked List");
            System.out.println("4. Menambahkan data setelah Ekor");
            System.out.println("5. Menambahkan data sebelum Head");
            System.out.println("6. Menyisipkan data dengan keyword NIM");
            System.out.println("7. Menghapus data dengan keyword NIM");
            System.out.println();
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            in.nextLine();
            switch (pilihan) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println();
                    Node gerbongH = new Node();
                    System.out.print("NIM gerbong\t= ");
                    gerbongH.NIM = in.nextInt();in.nextLine();
                    System.out.print("Nama Gerbong\t= ");
                    gerbongH.nama = in.nextLine();
                    LL.addNodefromHead(gerbongH);
                    System.out.println();
                    break;
                case 2 : 
                    System.out.println();
                    Node gerbongT = new Node();
                    System.out.print("NIM gerbong\t= ");
                    gerbongT.NIM = in.nextInt();in.nextLine();
                    System.out.print("Nama Gerbong\t= ");
                    gerbongT.nama = in.nextLine();
                    LL.addNodefromTail(gerbongT);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hasil Linked List");
                    LL.printNodefromHead();
                    System.out.println();
                    break;
                case 4 :
                    Node gerbongK = new Node();
                    System.out.print("NIM gerbong\t= ");
                    gerbongK.NIM = in.nextInt();in.nextLine();
                    System.out.print("Nama Gerbong\t= ");
                    gerbongK.nama = in.nextLine();
                    LL.insertNodeAfterTail(gerbongK);
                    System.out.println();
                    break;
                case 5 :
                    Node gerbongL = new Node();
                    System.out.print("NIM gerbong\t= ");
                    gerbongL.NIM = in.nextInt();in.nextLine();
                    System.out.print("Nama Gerbong\t= ");
                    gerbongL.nama = in.nextLine();
                    LL.insertNodeBeforeHead(gerbongL);
                    System.out.println();
                    break;
                case 6 :
                    Node gerbongM = new Node();
                    System.out.print("NIM gerbong\t= ");
                    gerbongM.NIM = in.nextInt();in.nextLine();
                    System.out.print("Nama Gerbong\t= ");
                    gerbongM.nama = in.nextLine();
                    System.out.print("Gerbong dimasukkan setelah gerbong dengan NIM = ");
                    int keyNIM = in.nextInt(); in.nextLine();
                    LL.insertNodeMiddle(gerbongM, keyNIM);
                    System.out.println();
                    break;
                case 7 :
                    System.out.print("Gerbong yang dihapus dengan NIM = ");
                    int keyNIMhapus = in.nextInt(); in.nextLine();
                    LL.deleteNodeMiddle(keyNIMhapus);
                    System.out.println();
                    break;
                default:
                    System.out.println("Masukkan Pilihan Anda dengan Benar");
            }
        } while (pilihan != 0);

    }
}
