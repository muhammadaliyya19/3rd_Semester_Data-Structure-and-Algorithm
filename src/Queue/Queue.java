/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author asus
 */
public class Queue {
    public NodeQueue front = null; //inisialisasi awal null
    private NodeQueue rear = null; //inisialisasi awal null
    private NodeQueue kondektur = null; //inisialisasi awal null
    public int count = 0;
    
    public void enqueue(NodeQueue gerbong) {
        if (front == null) {
            front = gerbong;
        } else {
            rear.next = gerbong; //gerbong baru yang masuk 
        }
        rear = gerbong; //karena kode nya sama antara if dan else, maka dikeluarkan saja
        count++;
    }
    public boolean isEmpty(){
        if (front == null){
            return true;
        }
        else {
            return false;
        }
    }
    public NodeQueue dequeue(){
        kondektur = front;
        if (isEmpty() == false){
            front = front.next;
            count--;
            return kondektur;
        }
        else {
            return null;
        }
    }
}
