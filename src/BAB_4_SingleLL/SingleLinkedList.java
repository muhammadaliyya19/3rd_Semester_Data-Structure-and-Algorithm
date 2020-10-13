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
class Node {

    Buku Buku;
    int data;
    Node next;
}

public class SingleLinkedList {

    private Node pointer;

    public SingleLinkedList() {
        pointer = null;
    }

    public void buatNodeBuku(Buku input, int dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.Buku = input;
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }

    public boolean sisipBuku(int sewa1, int sewa2) {
        Node n = pointer;
        while ((n != null) && (n.Buku.hargaSewa != sewa2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node nn = new Node();
        nn.Buku.hargaSewa = sewa1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }

    public int hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }

    public void sisipDataDiAkhir(Buku input) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.Buku = input;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }

    public void sisipDataUrutBuku(Buku input) {
        Node kondektur = pointer;
        Node sisip = new Node();
        Node temp;
        sisip.Buku = input;
        if (pointer == null) {
            sisip.next = pointer;
            pointer = sisip;
        } else {
            while (kondektur != null) {
                if (kondektur.Buku.hargaSewa < input.hargaSewa) {
                    sisip.next = kondektur;
                    pointer = sisip;
                    break;
                } else {
                    temp = kondektur.next;
                    kondektur.next = sisip;
                    sisip.next = temp;
                    break;
                }
            }
        }
    }

    public void hapusData(int dataHapus) {
        while (pointer != null) {
            if (pointer.next.data == dataHapus) {
                Node temp = pointer.next;
                pointer.next = temp.next;
                temp = null;
                break;
            }
            pointer = pointer.next;
        }
    }

    public Node getPointer() {
        return pointer;
    }

    public static SingleLinkedList gabung(SingleLinkedList L1, SingleLinkedList L2) {
        SingleLinkedList Gabung = new SingleLinkedList();
        Node tempHead = L1.getPointer();
        Node Kondektur = L1.getPointer();
        Node Temp;
        while (Kondektur != null) {
            if (Kondektur.next == null) {
                Temp = L2.getPointer();
                L2.pointer = tempHead;
                Kondektur.next = Temp;
                break;
            }
            Kondektur = Kondektur.next;
        }
        Gabung = L2;
        return Gabung;
    }

    public void cetakBuku(String kom) {
        System.out.println(kom);
        System.out.println("===== ===== ===== ===== ===== =====");
        Node n = pointer;
        while (n != null) {
            System.out.print(n.data + ". Judul Buku    : " + n.Buku.getJudul() + "\n"
                    + "   Kategori Buku : " + n.Buku.getKategori() + "\n"
                    + "   Harga Sewa    : " + n.Buku.getHargaSewa() + "\n"
                    + "   Denda Buku    : " + n.Buku.getHargaDenda() + "\n |vvv| ");
            System.out.println("----- ----- ----- ----- ----- ----- |vvv| ");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SingleLinkedList l = new SingleLinkedList();
        Buku b1;
        l.buatNodeBuku(b1 = new Buku("Novel", "Edensor", 4000.0, 400), 1);
        l.buatNodeBuku(b1 = new Buku("Komik", "One Piece", 3000.0, 300), 2);
        l.buatNodeBuku(b1 = new Buku("Majalah", "Gaul", 3500.0, 350), 3);
        l.buatNodeBuku(b1 = new Buku("Jurnal", "Jurnal Internasional", 5000.0, 500), 4);
        l.buatNodeBuku(b1 = new Buku("Novel", "Hujan", 4000.0, 400), 5);
        l.cetakBuku("l : LL Asal");
        l.sisipDataDiAkhir(b1 = new Buku("Majalah", "Humour", 3500.0, 350));
        l.cetakBuku("l : LL setelah sisip di akhir");
        System.out.println(l.hapusDiDepan());
        l.cetakBuku("l : LL setelah dihapus di depan");
        l.hapusData(3);
        l.cetakBuku("LL setelah buku no 3 dihapus");
        SingleLinkedList l2 = new SingleLinkedList();
        l2.sisipDataUrutBuku(b1 = new Buku("Novel", "Maryamah Karpov", 4000.0, 400));
        l2.sisipDataUrutBuku(b1 = new Buku("Komik", "Tekken Chinmi", 3000.0, 300));
        l2.sisipDataUrutBuku(b1 = new Buku("Majalah", "Resep Makanan", 3500.0, 350));
        l2.sisipDataUrutBuku(b1 = new Buku("Jurnal", "Jurnal Dalam Negeri", 5000.0, 500));
        l2.sisipDataUrutBuku(b1 = new Buku("Novel", "Pulang", 4000.0, 400));
        l2.cetakBuku("L2 : LL terurut Harga");
        SingleLinkedList L3 = SingleLinkedList.gabung(l, l2);
        L3.cetakBuku("L3 : L gabungan L1 dan L2");
    }
}
