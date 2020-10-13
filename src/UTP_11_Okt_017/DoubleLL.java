package UTP_11_Okt_017;

import java.util.Scanner;

class Node {

    Mahasiswa data;
    Node prev;
    Node next;
}

class DLL_Algoritma {

    Node pKepala, pEkor;

    public Mahasiswa BuatData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String Nama = in.next();
        in.nextLine();
        System.out.print("NIM : ");
        String NIM = in.next();
        in.nextLine();
        System.out.print("Matkul : ");
        String Matkul = in.next();
        in.nextLine();
        Mahasiswa m1 = new Mahasiswa(Nama, NIM, Matkul);
        return m1;
    }

    public void sisipDipEkor() {
        Node baru = new Node();
        baru.data = BuatData();
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

    public void HapusTertentu(String NIM) {
        Node kondektur = pKepala;
        while (kondektur != pEkor) {
            if (NIM.equals(kondektur.next.data.getNIM())) {
                Node hapus = kondektur.next;
                kondektur.next = hapus.next;
                hapus.next.prev = kondektur;
                hapus = null;
                break;
            }
            kondektur = kondektur.next;
        }
    }

    public void cetak(String kom) {
        System.out.println(kom);
        Node p = pKepala;
        while (p != pEkor.next) {
            p.data.ShowData();
            p = p.next;
        }
    }
}

public class DoubleLL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DLL_Algoritma D1 = new DLL_Algoritma();
        int pil = 0;
        while (pil < 4) {
            System.out.println("1. Sisipkan data mahasiswa");
            System.out.println("2. Hapus data mahasiswa");
            System.out.println("3. Cetak semua data mahasiswa");
            System.out.print("Pilih : ");
            pil = in.nextInt();
            switch (pil) {
                case 1: {
                    D1.sisipDipEkor();
                    break;
                }
                case 2: {
                    System.out.println("Masukkan NIM Mahasiswa yang ingin dihapus");
                    System.out.print("NIM : ");
                    String NIM = in.next();
                    D1.HapusTertentu(NIM);
                    break;
                }
                case 3: {
                    D1.cetak(" - - - - - - - Data Mahasiswa - - - - - - - ");
                    break;
                }
                default: {
                    System.out.println("Pilihan Salah. \nProgram dihentikan.");
                    break;
                }
            }
        }

    }
}
