/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

/**
 *
 * @author asus
 */
public class SingleLL { //class Algoritmanya

    //Atribut 
    //kenapa dibuat private? karena yang berhak mengubah nilainya adalah head dan tailnya
    private Node head = null; //inisialisasi awal null
    private Node tail = null; //inisialisasi awal null
    private Node kondektur = null; //inisialisasi awal null

    //Method
    public void addNodefromHead(Node gerbong) {
        if (head == null) {
            head = gerbong;
        } else {
            tail.next = gerbong; //gerbong baru yang masuk 
        }
        tail = gerbong; //karena kode nya sama antara if dan else, maka dikeluarkan saja
    }

    public void addNodefromTail(Node gerbong) {
        if (head == null) {
            tail = gerbong;
        } else {
            gerbong.next = head;
        }
        head = gerbong;

    }

    public void insertNodeAfterTail(Node gerbong){
        tail.next = gerbong;
        tail = gerbong;
    }
    
    public void insertNodeBeforeHead(Node gerbong){
        gerbong.next = head;
        head = gerbong;
    }
    
    public void insertNodeMiddle(Node gerbong, int key){
        kondektur = head;
        while(kondektur != tail){
            if (key == kondektur.NIM){//data key yang dicari ketemu
                gerbong.next = kondektur.next;
                kondektur.next = gerbong;
                break;
            }
                
            kondektur = kondektur.next;
        }
        
    }
    
    public void deleteNodeMiddle(int key){
        kondektur = head;
        while(kondektur != tail){
            if (key == kondektur.next.NIM){//data key yang dicari ketemu
                Node hapus = kondektur.next;
                kondektur.next = hapus.next;
                hapus = null;
                break;
            }
                
            kondektur = kondektur.next;
        }
    }
    
    public void printNodefromHead() {
        kondektur = head;
        System.out.print(kondektur.nama + "-->");//kondektur ada di A

//        kondektur = kondektur.next;
//        System.out.println(kondektur.nama); //kondektur ada di B
//        
//        kondektur = kondektur.next;
//        System.out.println(kondektur.nama); //kondektur ada di C
        while (kondektur != tail) {
            kondektur = kondektur.next;
            System.out.print(kondektur.nama + "-->");
        }
        System.out.println("null");
    }
}
