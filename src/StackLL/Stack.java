/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLL;

/**
 *
 * @author asus
 */
public class Stack {
    //Atribut 
    //kenapa dibuat private? karena yang berhak mengubah nilainya adalah head dan tailnya
    public NodeStack top = null; //inisialisasi awal null
    private NodeStack bottom = null; //inisialisasi awal null
    private NodeStack kondektur = null; //inisialisasi awal null
    public int count = 0;
    
    public void push(NodeStack gerbong) {
        if (top == null) {
            bottom = gerbong;
        } else {
            gerbong.next = top;
        }
        top = gerbong;
        count++;
    }
    public NodeStack pop(){
        kondektur = top;
        if (isEmpty() == false){
            top = top.next;
            count--;
            return kondektur;
        }
        else {
            return null;
        }
    }
    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        else {
            return false;
        }
    }
    public void printStack(){
        kondektur = top;
        System.out.println(kondektur.nama + "-->");
        while (kondektur != bottom) {
            kondektur = kondektur.next;
            System.out.println(kondektur.nama + "-->");
        }
        System.out.println("null");
    }
}
