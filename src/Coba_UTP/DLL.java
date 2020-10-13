/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba_UTP;
import java.util.Scanner;
/**
 *
 * @author Muhammad Aliyya Ilmi
 */
class Node{
    int Data;
    Node next;
    Node prev;
}

class DLL_Structure{
    Node Pawal , Pakhir;
    public boolean isEmpty(){
        if (Pawal == null) {
            return true;
        }else{
            return false;
        }
    }
    
    public int showAllgorithm(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Sisip node didepan");
        System.out.println("2. Sisip node dibelakang");
        System.out.println("3. Sisip node setelah data tertentu");
        System.out.println("4. Hapus node didepan");
        System.out.println("5. Hapus node dibelakang");
        System.out.println("6. Hapus node dengan data tertentu");
        System.out.println("7. Cetak node dari depan");
        System.out.println("8. Cetak node dari belakang");
        System.out.println("9. Keluar");
        System.out.print("Pilih : ");
        int pilih = in.nextInt();
        pilihAlgoritma(pilih);
        return pilih;
    }
    
    public void buatNode(){
        Scanner in = new Scanner(System.in);
        System.out.print("Isi data : ");
        Node d1 = new Node();
        d1.Data = in.nextInt();
        d1.next = null;
        d1.prev = null;
        Pawal  = d1;
        Pakhir = d1;
    }
    
    public Node bikinNode(){
        Scanner in = new Scanner(System.in);
        System.out.print("Isi data : ");
        Node d1 = new Node();
        d1.Data = in.nextInt();
        return d1;
    }
    
    public void SisipDidepan(){
        Node gerbong = bikinNode();
        gerbong.prev = null;
        gerbong.next = Pawal;
        Pawal.prev = gerbong;
        Pawal = gerbong;
    }
    
    public void SisipDibelakang(){
        Node gerbong = bikinNode();
        gerbong.prev = Pakhir;
        Pakhir.next = gerbong;
        Pakhir = gerbong;
    }
    
    public void SisipSetelah(int data){
        Node gerbong = bikinNode();
        Node Kondektur = Pawal;
        while (Kondektur != null) {    
            if(Kondektur.Data == data){
                Node temp = Kondektur;
                Kondektur.next = gerbong;
                gerbong.prev = Kondektur;
                gerbong.next = temp.next;
                break;
            }
            Kondektur = Kondektur.next;
        }
    }
    
    public void CetakDepan(){
        Node Kondektur = Pawal;
        while(Kondektur.next != null){
            System.out.print(Kondektur.Data + " <->");
            Kondektur = Kondektur.next;
        }
        System.out.println(" NULL");
    }
    
    public void CetakBelakang(){
        Node Kondektur = Pakhir;
        while(Kondektur.prev != null){
            System.out.print(Kondektur.Data + " <->");
            Kondektur = Kondektur.prev;
        }
        System.out.println(" NULL");
    }
    
    public void HapusDiDepan(){
        Node temp = Pawal;
        Pawal = temp.next;
        Pawal.prev = null;
        temp = null;
    }

    public void HapusDiAkhir(){
        Node temp = Pakhir;
        Pakhir = temp.prev;
        Pakhir.next = null;
        temp = null;
    }
    
    public void HapusData(int data){
        Node Kondektur = Pawal;
        while (Kondektur != null) {    
            if(Kondektur.next.Data == data){
                Node temp = Kondektur.next;
                Kondektur.next = temp.next;
                temp.next.prev = Kondektur;
                temp = null;
                break;
            }
            Kondektur = Kondektur.next;
        }
    }

    public void pilihAlgoritma(int pilih){
        switch (pilih){
            case 1 : {
                SisipDidepan();
                break;
            }
            case 2 : {
                SisipDibelakang();
                break;
            }
            case 3 : {
                SisipSetelah(pilih);
                break;
            }
            case 4 : {
                HapusDiDepan();
                break;
            }
            case 5 : {
                HapusDiAkhir();
                break;
            }
            case 6 : {
                Scanner in = new Scanner(System.in);
                System.out.print("Isi data : ");
                int data = in.nextInt();
                HapusData(data);
                break;
            }
            case 7 : {
                CetakDepan();
                break;
            }
            case 8 : {
                CetakBelakang();
                break;
            }
            case 9 : {
                System.out.println("Program dihentikan");
                break;
            }
            default : {
                System.out.println("Pilihan salah");
                break;
            }
        }
    }
}

public class DLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==== ==== ==== DOUBLE LINKED LIST ==== ==== ====");
        DLL_Structure D = new DLL_Structure();
        int i = 0;
        while (i < 9) {                
            if(D.isEmpty()){
                System.out.print("DLL masih kosong tambahkan Node ? Y / N : ");
                String ask = in.next();
                if(ask.equals("Y")){
                    D.buatNode();
                }else{
                    System.out.println("Program dihentikan");
                    i = 9;
                }
            }else{
                while (i < 9) {                
                    System.out.println("Dll sudah tidak kosong. \n" +
                                   "Pilih algoritma yang ingin anda lakukan");
                    i = D.showAllgorithm();
                }
            }
        }
    }
}
