/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;



/**
 *
 * @author asus
 */
public class DoubleLL {
    //Atribut 
    //kenapa dibuat private? karena yang berhak mengubah nilainya adalah head dan tailnya
    private DLLNode head = null; //inisialisasi awal null
    private DLLNode tail = null; //inisialisasi awal null
    private DLLNode kondektur = null; //inisialisasi awal null
    
    //Method
    public void addNodefromHead(DLLNode gerbong) {
        if (head == null) {
            head = gerbong;
        } else {
            tail.next = gerbong; //gerbong baru yang masuk 
            gerbong.prev = tail;
        }
        tail = gerbong; //karena kode nya sama antara if dan else, maka dikeluarkan saja
    }
    
    public void insertNodeAfterTail(DLLNode gerbong){
        tail.next = gerbong;
        gerbong.prev = tail;
        tail = gerbong;
    }
    
    public void printNodefromHead() {
        kondektur = head;
        System.out.print("null<==>"+kondektur.nama + "<==>");
        while (kondektur != tail) {
            kondektur = kondektur.next;
            System.out.print(kondektur.nama + "<==>");
        }
        System.out.println("null");
    }
    
    public void printNodefromTail() {
        kondektur = tail;
        System.out.print("null<==>"+kondektur.nama + "<==>");
        while (kondektur != head) {
            kondektur = kondektur.prev;
            System.out.print(kondektur.nama + "<==>");
        }
        System.out.println("null");
    }
}
